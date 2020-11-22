package me.coley.nimbus;

import me.coley.nimbus.serial.Serialization;
import me.coley.nimbus.util.NetworkUtils;

import java.io.IOException;
import java.util.Optional;

/**
 * Nimbus core type. Provides access to all services.
 *
 * @author Matt Coley
 */
public class Nimbus {
	private final Serialization serialization = new Serialization();
	private final NetConfig config = new NetConfig();

	/**
	 * Creates a client configured with the current nimbus context.
	 * It represents the local device.
	 *
	 * @return Client representing local self.
	 *
	 * @throws IOException
	 * 		When the local address could not be found.
	 */
	public Client createClient() throws IOException {
		// Get address, IPv4/IPv6 based on net config.
		Optional<String> address = getNetConfig().doUseIpv6() ?
				NetworkUtils.getLocalIPv6Host() : NetworkUtils.getLocalIPv4Host();
		// Create client representing local self if address found.
		if (address.isPresent()) {
			return new Client(this, address.get());
		} else {
			throw new IOException("Failed to get local address");
		}
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
}
