package me.coley.nimbus.discovery;

import me.coley.nimbus.Client;
import me.coley.nimbus.Nimbus;
import me.coley.nimbus.NimbusEntity;
import me.coley.nimbus.util.Log;
import org.slf4j.Logger;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;

/**
 * Local client discovery. It is intended that only one discovery instance is run per application.
 *
 * @author Matt Coley
 */
public class Discovery implements NimbusEntity {
	private static final String DEFAULT_MULTICAST_ADDRESS = "239.78.73.77";
	private static final int DEFAULT_MULTICAST_PORT = 6677;
	private static final byte[] DISCOVER_DATA_MATCH = {0x4E, 0x49, 0x4D, 0x42};
	private static final long DISCOVER_INTERVAL_MS = 5_000;
	private static final Logger logger = Log.NETWORKING;
	private final ExecutorService service = Executors.newFixedThreadPool(2);
	private final Nimbus nimbus;
	private final Client client;
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
		// TODO: Allow distinguish between clients running on the same machine (Net > App)
		// TODO: Where to include data-type pub-sub matches between clients?
		// Create message:
		//  - Header  (u4)
		//  - Address (uX)
		ByteBuffer buffer = ByteBuffer.allocate(256);
		buffer.put(DISCOVER_DATA_MATCH);
		buffer.put(client.getAddress().getBytes(StandardCharsets.UTF_8));
		byte[] multicastMessage = buffer.array();
		// Setup socket
		try (DatagramSocket socket = new DatagramSocket()) {
			InetAddress group = InetAddress.getByName(multicastAddress);
			// Write loop, announce self on interval
			while (true) {
				DatagramPacket packet = new DatagramPacket(multicastMessage, multicastMessage.length, group, multicastPort);
				socket.send(packet);
				logger.debug("Sent discovery announce to {}:{}", multicastAddress, multicastPort);
				Thread.sleep(DISCOVER_INTERVAL_MS);
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
				// Get remaining data after prefix
				byte[] data = Arrays.copyOfRange(received, DISCOVER_DATA_MATCH.length, received.length);
				String clientAddress = new String(data).trim();
				// Ignore self in discovery
				if (isSelf(clientAddress)) {
					logger.debug("Ignoring self in discovery {}", clientAddress);
					continue;
				}
				logger.debug("Found new client via discovery {}", clientAddress);
				// Notify listeners of new client's existence
				if (onDiscover != null) {
					onDiscover.accept(new Client(nimbus, clientAddress));
				}
			}
		} catch (Exception ex) {
			logger.error("Error in discovery routine: " + multicastAddress + ":" + multicastPort, ex);
		}
	}

	/**
	 * Check if a given address represents ourselves.
	 *
	 * @param clientAddress
	 * 		Some address from a discovered client.
	 *
	 * @return {@code true} when matching the client stored in the discover instance.
	 */
	public boolean isSelf(String clientAddress) {
		return client.getAddress().equals(clientAddress);
	}

	@Override
	public Nimbus getNimbus() {
		return nimbus;
	}
}
