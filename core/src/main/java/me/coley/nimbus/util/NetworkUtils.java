package me.coley.nimbus.util;

import org.slf4j.Logger;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Assorted networking utilities.
 *
 * @author Matt Coley
 */
public class NetworkUtils {
	private static final Logger logger = Log.NETWORKING;

	/**
	 * @return Local IPv4 host address, if it could be found.
	 */
	public static Optional<String> getLocalIPv4Host() {
		String address = null;
		try {
			for (InetAddress networkAddress : getNetAddresses()) {
				if (networkAddress instanceof Inet4Address) {
					address = networkAddress.getHostAddress();
					break;
				}
			}
		} catch (IOException ex) {
			logger.error("Failed to get local IPv4 host address", ex);
		}
		return Optional.ofNullable(address);
	}

	/**
	 * @return Local IPv6 host address, if it could be found.
	 */
	public static Optional<String> getLocalIPv6Host() {
		String address = null;
		try {
			for (InetAddress networkAddress : getNetAddresses()) {
				if (networkAddress instanceof Inet6Address) {
					address = networkAddress.getHostAddress();
					break;
				}
			}
		} catch (IOException ex) {
			logger.error("Failed to get local IPv6 host address", ex);
		}
		return Optional.ofNullable(address);
	}

	/**
	 * @return All addresses shared among all online, non-virtual, non-loopback network interfaces.
	 *
	 * @throws SocketException
	 * 		When the network interfaces containing the addresses could not be fetched.
	 */
	public static Collection<InetAddress> getNetAddresses() throws SocketException {
		List<InetAddress> addresses = new ArrayList<>();
		for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
			if (!networkInterface.isUp() || networkInterface.isVirtual() || networkInterface.isLoopback()) {
				continue;
			}
			addresses.addAll(Collections.list(networkInterface.getInetAddresses()));
		}
		return addresses;
	}
}
