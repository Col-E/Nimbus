package me.coley.nimbus;

import me.coley.nimbus.serial.Serialization;
import me.coley.nimbus.util.NetworkUtils;

import java.net.InetAddress;
import java.util.Optional;
import java.util.Random;

/**
 * Nimbus core type. Provides access to all services.
 *
 * @author Matt Coley
 */
public class Nimbus {
	private final Serialization serialization = new Serialization();
	private final NetConfig config;
	private final NimbusID identity;

	/**
	 * Create a new nimbus instance with the default configuration.
	 */
	public Nimbus() {
		this(new NetConfig());
	}

	/**
	 * Create a new nimbus instance with the given configuration.
	 * The {@link #getIdentity() nimbus identity} will be generated based on the {@link NetConfig#doUseIpv6()} value.
	 *
	 * @param config
	 * 		Config to pull values from.
	 */
	public Nimbus(NetConfig config) {
		this.config = config;
		// Setup identifier
		Optional<InetAddress> host = config.doUseIpv6() ?
				NetworkUtils.getLocalIPv6Host() : NetworkUtils.getLocalIPv4Host();
		if (host.isPresent()) {
			identity = new NimbusID(host.get().getAddress(), new Random().nextInt());
		} else {
			throw new IllegalStateException("Could not find local host to configure nimbus identifier with!");
		}
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
	 * @return Network config.
	 */
	public NetConfig getNetConfig() {
		return config;
	}

	/**
	 * @return Nimbus identifier.
	 */
	public NimbusID getIdentity() {
		return identity;
	}
}
