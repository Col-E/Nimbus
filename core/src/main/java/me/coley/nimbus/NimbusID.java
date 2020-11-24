package me.coley.nimbus;

import me.coley.nimbus.util.NetworkUtils;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Objects;

/**
 * Identifier to distinguish between nimbus instances.
 *
 * @author Matt Coley
 */
public class NimbusID {
	private final byte[] networkAddress;
	private final int applicationId;

	/**
	 * @param networkAddress
	 * 		Network address segments.
	 * @param applicationId
	 * 		Application identifier.
	 */
	public NimbusID(byte[] networkAddress, int applicationId) {
		this.networkAddress = networkAddress;
		this.applicationId = applicationId;
	}

	/**
	 * @return Network address segments.
	 *
	 * @see InetAddress#getAddress()
	 */
	public byte[] getNetworkAddress() {
		return networkAddress;
	}

	/**
	 * @return Application identifier.
	 */
	public int getApplicationId() {
		return applicationId;
	}

	/**
	 * @return {@code true} when {@link #getNetworkAddress()} represents an IPv6 address.
	 */
	public boolean isNetworkAddressIPv6() {
		return networkAddress.length == 16;
	}

	/**
	 * @param cache
	 * 		Cached network information.
	 * @param other
	 * 		Some other NimbusID.
	 *
	 * @return {@code} true when the other identifier belongs to an instance on the same network.
	 */
	public boolean isOnSameNetwork(HostInfoCache cache, NimbusID other) {
		int subnetPrefix = cache.getLocalSubnetAddress().getNetworkPrefixLength();
		return NetworkUtils.onSameNetwork(networkAddress, other.getNetworkAddress(), subnetPrefix);
	}

	@Override
	public String toString() {
		return "NimbusID{" +
				"networkAddress=" + Arrays.toString(networkAddress) +
				", applicationId=" + applicationId +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NimbusID nimbusID = (NimbusID) o;
		return applicationId == nimbusID.applicationId &&
				Arrays.equals(networkAddress, nimbusID.networkAddress);
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(applicationId);
		result = 31 * result + Arrays.hashCode(networkAddress);
		return result;
	}
}
