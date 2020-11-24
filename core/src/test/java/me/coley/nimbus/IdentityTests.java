package me.coley.nimbus;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.*;


public class IdentityTests {
	private static final boolean USE_IPV6 = false;
	private static HostInfoCache cache;

	@BeforeAll
	static void setup() throws IOException {
		cache = new HostInfoCache(USE_IPV6);
	}

	@Test
	void testEquality() throws UnknownHostException {
		InetAddress addressOne = Inet4Address.getByName("127.0.0.1");
		InetAddress addressTwo = Inet4Address.getByName("127.0.0.2");

		assertNotEquals(
				new NimbusID(addressOne.getAddress(), 0),
				new NimbusID(addressOne.getAddress(), 1));

		assertNotEquals(
				new NimbusID(addressOne.getAddress(), 0),
				new NimbusID(addressTwo.getAddress(), 0));

		assertEquals(
				new NimbusID(addressOne.getAddress(), 0),
				new NimbusID(addressOne.getAddress(), 0));
	}

	@Test
	void testSameNetwork() throws IOException {
		InetAddress addressOne = Inet4Address.getByName("127.0.0.1");
		InetAddress addressTwo = Inet4Address.getByName("127.0.0.2");

		NimbusID one = new NimbusID(addressOne.getAddress(), 0);
		NimbusID two = new NimbusID(addressTwo.getAddress(), 1);

		assertTrue(one.isOnSameNetwork(cache, one));
		assertTrue(one.isOnSameNetwork(cache, two));
		assertTrue(two.isOnSameNetwork(cache, one));
	}

	@Test
	void testNotSameNetwork() throws IOException {
		InetAddress address100 = Inet4Address.getByName("100.0.0.0");
		InetAddress address150 = Inet4Address.getByName("150.0.0.0");
		InetAddress address150a = Inet4Address.getByName("150.1.0.0");
		InetAddress address150b = Inet4Address.getByName("150.0.1.0");

		NimbusID n100 = new NimbusID(address100.getAddress(), 0);
		NimbusID n150 = new NimbusID(address150.getAddress(), 1);
		NimbusID n150a = new NimbusID(address150a.getAddress(), 2);
		NimbusID n150b = new NimbusID(address150b.getAddress(), 3);

		assertFalse(n100.isOnSameNetwork(cache, n150));
		assertFalse(n150.isOnSameNetwork(cache, n100));
		assertFalse(n150.isOnSameNetwork(cache, n150a));
		assertFalse(n150a.isOnSameNetwork(cache, n150));

		// If the IPv4 mask is "255.255.255.0" then we can check against "address150b"
		int octets = cache.getLocalSubnetAddress().getNetworkPrefixLength() / 8;
		if (octets >= 3) {
			assertFalse(n150.isOnSameNetwork(cache, n150b));
			assertFalse(n150a.isOnSameNetwork(cache, n150b));
			assertFalse(n150b.isOnSameNetwork(cache, n150a));
			assertFalse(n150b.isOnSameNetwork(cache, n150));
		}
	}
}
