package me.coley.nimbus;

import me.coley.nimbus.config.NetConfig;
import me.coley.nimbus.config.SerialConfig;
import me.coley.nimbus.serial.Serialization;

import java.io.IOException;
import java.util.Random;

/**
 * Nimbus core type. Provides access to all services.
 *
 * @author Matt Coley
 */
public class Nimbus {
	private final Serialization serialization;
	private final NetConfig configNet;
	private final SerialConfig configSerial;
	private final NimbusID identity;
	private HostInfoCache hostCache;

	/**
	 * Create a new nimbus instance with the default configuration.
	 */
	public Nimbus() {
		this(new NetConfig(), new SerialConfig());
	}

	/**
	 * Create a new nimbus instance with the given configuration.
	 * The {@link #getIdentity() nimbus identity} will be generated based on the {@link NetConfig#doUseIpv6()} value.
	 *
	 * @param configNet
	 * 		Network config to pull values from.
	 * @param configSerial
	 * 		Serialization config to pull values from.
	 *
	 * @throws IllegalStateException
	 * 		When host address information cannot be fetched to populate {@link #getHostCache()}.
	 * 		This information is required to populate {@link #getIdentity()}.
	 */
	public Nimbus(NetConfig configNet, SerialConfig configSerial) {
		this.configNet = configNet;
		this.configSerial = configSerial;
		// Setup serialization
		serialization = new Serialization(configSerial);
		// Setup cached information
		try {
			refreshHostCache();
		} catch (IOException e) {
			throw new IllegalStateException("Could not find local host to configure nimbus identifier with!");
		}
		// Setup identifier
		identity = new NimbusID(getHostCache().getLocalNetworkAddress().getAddress(), Math.abs(new Random().nextInt()));
	}

	/**
	 * Creates a client configured with the current nimbus context.
	 * It represents the local device.
	 *
	 * @return Client representing local self.
	 */
	public Client createClient() {
		return new Client(this, getIdentity());
	}

	/**
	 * @return Serialization service.
	 */
	public Serialization getSerialization() {
		return serialization;
	}

	/**
	 * @return Cached network host information.
	 */
	public HostInfoCache getHostCache() {
		return hostCache;
	}

	/**
	 * Refreshes the cached network host information.
	 *
	 * @throws IOException
	 * 		When the host address information cannot be fetched.
	 */
	public void refreshHostCache() throws IOException {
		this.hostCache = new HostInfoCache(getNetConfig().doUseIpv6());
	}

	/**
	 * @return Network config.
	 */
	public NetConfig getNetConfig() {
		return configNet;
	}

	/**
	 * @return Serialization config.
	 */
	public SerialConfig getSerialConfig() {
		return configSerial;
	}

	/**
	 * @return Nimbus identifier.
	 */
	public NimbusID getIdentity() {
		return identity;
	}
}
