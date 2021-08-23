package me.coley.nimbus;


import me.coley.nimbus.util.NetworkUtils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.util.Optional;

import static me.coley.nimbus.util.NetworkUtils.*;


/**
 * A cache for networking information pulled from {@link NetworkUtils}.
 *
 * @author Matt Coley
 */
public class HostInfoCache {
	private final InetAddress localNetworkAddress;
	private final InetAddress localhostAddress;
	private final InterfaceAddress localSubnetAddress;

	/**
	 * Create the cache.
	 *
	 * @param ipv6
	 * 		If addresses should be in ipv6 format.
	 *
	 * @throws IOException
	 * 		When addresses could not be fetched.
	 */
	public HostInfoCache(boolean ipv6) throws IOException {
		Optional<InetAddress> opt = ipv6 ? getLocalIPv6Host() : getLocalIPv4Host();
		if (!opt.isPresent())
			throw new IOException("Failed to find local network host address");
		localNetworkAddress = opt.get();
		localhostAddress = getLocalHost();
		localSubnetAddress = getLocalSubnet(ipv6);
	}

	/**
	 * @return Address of current device on the local area network.
	 */
	public InetAddress getLocalNetworkAddress() {
		return localNetworkAddress;
	}

	/**
	 * @return Address of {@code localhost}.
	 */
	public InetAddress getLocalhostAddress() {
		return localhostAddress;
	}

	/**
	 * @return Subnet address.
	 */
	public InterfaceAddress getLocalSubnetAddress() {
		return localSubnetAddress;
	}
}
