package me.coley.nimbus.discovery;

import me.coley.nimbus.Client;
import me.coley.nimbus.Nimbus;
import me.coley.nimbus.NimbusEntity;
import me.coley.nimbus.NimbusID;
import me.coley.nimbus.util.Log;
import org.slf4j.Logger;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * Local client discovery. It is intended that only one discovery instance is run per application.
 *
 * @author Matt Coley
 */
public class Discovery implements NimbusEntity {
	// Public constants
	public static final String DEFAULT_MULTICAST_ADDRESS = "239.78.73.77";
	public static final int DEFAULT_MULTICAST_PORT = 6677;
	public static final long DEFAULT_DISCOVER_INTERVAL_MS = 1000;
	//
	private static final byte[] DISCOVER_DATA_MATCH = {0x4E, 0x49, 0x4D, 0x42};
	private static final Logger logger = Log.NETWORKING;
	private final ExecutorService service = Executors.newFixedThreadPool(2);
	private final Nimbus nimbus;
	private final Client client;
	private long discoverIntervalMs = DEFAULT_DISCOVER_INTERVAL_MS;
	private String multicastAddress = DEFAULT_MULTICAST_ADDRESS;
	private int multicastPort = DEFAULT_MULTICAST_PORT;
	private Future<?> discoveryFuture;
	private Future<?> announceFuture;
	private Consumer<Client> onDiscover;

	/**
	 * Create a discoverer for the local network.
	 *
	 * @param client
	 * 		Client to represent the current user.
	 */
	public Discovery(Client client) {
		this.client = client;
		this.nimbus = client.getNimbus();
	}

	/**
	 * @param onDiscover
	 * 		Consumer to handle discovered clients.
	 */
	public void setOnDiscover(Consumer<Client> onDiscover) {
		this.onDiscover = onDiscover;
	}

	/**
	 * @return Discovery broadcast interval, in milliseconds.
	 */
	public long getDiscoverIntervalMs() {
		return discoverIntervalMs;
	}

	/**
	 * @param intervalMs
	 * 		Discovery broadcast interval, in milliseconds.
	 */
	public void setDiscoverIntervalMs(long intervalMs) {
		this.discoverIntervalMs = intervalMs;
	}

	/**
	 * @param interval
	 * 		Discovery broadcast interval.
	 * @param sourceUnit
	 * 		Time unit of given interval.
	 */
	public void setDiscoverInterval(long interval, TimeUnit sourceUnit) {
		setDiscoverIntervalMs(TimeUnit.MILLISECONDS.convert(interval, sourceUnit));
	}

	/**
	 * @return Address to use to join a multicast group.
	 */
	public String getMulticastAddress() {
		return multicastAddress;
	}

	/**
	 * @param multicastAddress
	 * 		Address to use to join a multicast group.
	 */
	public void setMulticastAddress(String multicastAddress) {
		this.multicastAddress = multicastAddress;
	}

	/**
	 * @return Port for discovery listener to bind to.
	 */
	public int getMulticastPort() {
		return multicastPort;
	}

	/**
	 * @param multicastPort
	 * 		Port for discovery listener to bind to.
	 */
	public void setMulticastPort(int multicastPort) {
		this.multicastPort = multicastPort;
	}

	/**
	 * Starts new discovery threads.
	 *
	 * @throws IllegalStateException
	 * 		When discovery threads are already running.
	 */
	public void start() {
		// Check if already running
		if (discoveryFuture != null || announceFuture != null)
			throw new IllegalStateException("Discovery thread already running!");
		// Create new thread
		discoveryFuture = service.submit(this::discover);
		announceFuture = service.submit(this::announce);
	}

	/**
	 * Stops a discover threads. Can be restarted later by calling {@link #start()} again.
	 */
	public void stop() {
		// Kill the old thread if it exists
		if (discoveryFuture != null)
			discoveryFuture.cancel(true);
		if (announceFuture != null)
			announceFuture.cancel(true);
	}

	/**
	 * Announces self to the discovery group.
	 */
	@SuppressWarnings({"BusyWait", "InfiniteLoopStatement"})
	private void announce() {
		byte[] idSerial = nimbus.getSerialization().serializeObject(client.getIdentifier());
		// Create message
		ByteBuffer buffer = ByteBuffer.allocate(256);
		buffer.put(DISCOVER_DATA_MATCH);
		buffer.putShort((byte) idSerial.length);
		buffer.put(idSerial);
		// TODO: Include pub-sub data for matches between clients
		// buffer.putShort((short) pubsubSerial.length);
		// buffer.put(pubsubSerial);
		byte[] multicastMessage = buffer.array();
		// Setup socket
		try (DatagramSocket socket = new DatagramSocket()) {
			InetAddress group = InetAddress.getByName(multicastAddress);
			// Write loop, announce self on interval
			while (true) {
				DatagramPacket packet = new DatagramPacket(multicastMessage, multicastMessage.length, group, multicastPort);
				socket.send(packet);
				logger.debug("Sent discovery announce to {}:{}", multicastAddress, multicastPort);
				Thread.sleep(discoverIntervalMs);
			}
		} catch (Exception ex) {
			logger.error("Error in discovery routine: " + multicastAddress + ":" + multicastPort, ex);
		}
	}

	/**
	 * Finds other entities announcing themselves within the discovery group.
	 */
	@SuppressWarnings("InfiniteLoopStatement")
	private void discover() {
		// Setup socket
		try (MulticastSocket socket = new MulticastSocket(multicastPort)) {
			InetAddress group = InetAddress.getByName(multicastAddress);
			socket.joinGroup(group);
			// Read loop, look for packets matching a given prefix and read data from the remaining data
			// to describe client lookup information.
			byte[] buf = new byte[256];
			while (true) {
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				byte[] received = packet.getData();
				// Skip if prefix mismatched
				if (!Arrays.equals(DISCOVER_DATA_MATCH, Arrays.copyOf(received, DISCOVER_DATA_MATCH.length))) {
					continue;
				}
				// Get nimbus identifier
				int idLength = (received[DISCOVER_DATA_MATCH.length] << 8) + (received[DISCOVER_DATA_MATCH.length + 1]);
				int startIndex = DISCOVER_DATA_MATCH.length + 2; // Offset header array + length U2
				int endIndex = startIndex + idLength;
				byte[] data = Arrays.copyOfRange(received, startIndex, endIndex);
				NimbusID id = nimbus.getSerialization().deserializeObject(data, NimbusID.class);
				// Ignore self in discovery
				if (client.getIdentifier().equals(id)) {
					logger.debug("Ignoring self in discovery {}", id);
					continue;
				}
				logger.debug("Found new client via discovery {}", id);
				// Notify listeners of new client's existence
				if (onDiscover != null) {
					onDiscover.accept(new Client(nimbus, id));
				}
			}
		} catch (Exception ex) {
			logger.error("Error in discovery routine: " + multicastAddress + ":" + multicastPort, ex);
		}
	}

	@Override
	public Nimbus getNimbus() {
		return nimbus;
	}
}
