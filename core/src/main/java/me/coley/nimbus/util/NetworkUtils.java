package me.coley.nimbus.util;

import org.slf4j.Logger;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
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
	public static Optional<InetAddress> getLocalIPv4Host() {
		InetAddress address = null;
		try {
			for (InetAddress networkAddress : getNetAddresses()) {
				if (networkAddress instanceof Inet4Address) {
					address = networkAddress;
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
	public static Optional<InetAddress> getLocalIPv6Host() {
		InetAddress address = null;
		try {
			for (InetAddress networkAddress : getNetAddresses()) {
				if (networkAddress instanceof Inet6Address) {
					address = networkAddress;
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
			if (!networkInterface.isUp() || networkInterface.isVirtual() || networkInterface.isLoopback())
				continue;
			addresses.addAll(Collections.list(networkInterface.getInetAddresses()));
		}
		return addresses;
	}

	/**
	 * @return Localhost address.
	 *
	 * @throws UnknownHostException
	 * 		When the local host name could not be resolved into an address.
	 */
	public static InetAddress getLocalHost() throws UnknownHostException {
		return Inet6Address.getLocalHost();
	}

	/**
	 * @param ipv6
	 * 		If returned address should use IPv6.
	 *
	 * @return Local subnet interface address.
	 *
	 * @throws IOException
	 * 		When no matching address can be found.
	 */
	public static InterfaceAddress getLocalSubnet(boolean ipv6) throws IOException {
		try {
			NetworkInterface networkInterface = NetworkInterface.getByInetAddress(getLocalHost());
			for (InterfaceAddress address : networkInterface.getInterfaceAddresses()) {
				if (ipv6 && address.getAddress() instanceof Inet6Address)
					return address;
				else if (!ipv6 && address.getAddress() instanceof Inet4Address)
					return address;
			}
			throw new IOException("Failed to find matching address for localhost subnet (ipv6=" + ipv6 + ")");
		} catch (IOException ex) {
			throw new IOException("Error occurred looking up localhost subnet (ipv6=" + ipv6 + ")", ex);
		}
	}

	/**
	 * @param local
	 * 		Local address.
	 * @param remote
	 * 		Remote address.
	 * @param subnetPrefix
	 * 		Prefix length. Used in replacement of a subnet mask since the mask always includes the first X octets.
	 *
	 * @return {@code true} when the addresses belong to the same network.
	 *
	 * @see #getLocalSubnet(boolean)
	 */
	public static boolean onSameNetwork(byte[] local, byte[] remote, int subnetPrefix) {
		if (remote.length != local.length)
			return false;
		int octets = subnetPrefix / 8;
		for (int i = 0; i < octets; i++)
			if (remote[i] != local[i])
				return false;
		return true;
	}
}
