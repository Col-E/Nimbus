package me.coley.nimbus;

import me.coley.nimbus.discovery.Discovery;
import me.coley.nimbus.discovery.NimbusID;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static me.coley.nimbus.discovery.Discovery.*;

public class DiscoveryTests {
	private final Nimbus nimbus = new Nimbus();

	@ParameterizedTest
	@MethodSource(value = "provideConfig")
	void test(DiscoveryConfig config) throws Exception {
		AtomicBoolean visited = new AtomicBoolean();
		CountDownLatch lock = new CountDownLatch(1);
		synchronized (lock) {
			Client selfClient = nimbus.createClient();
			Client otherClient = new Client(nimbus, new NimbusID(new byte[]{10, 10, 10, 10}, 0));
			// Setup discovery:
			//  - Normal client (self)
			//  - Mock client (random address)
			//  - Normal client discovery should see mocked client's broadcast
			Discovery discoverySelf = Mockito.spy(selfClient.createDiscovery());
			Discovery discoveryOther = otherClient.createDiscovery();
			// Configure
			discoverySelf.setDiscoverIntervalMs(config.interval);
			discoverySelf.setMulticastAddress(config.address);
			discoverySelf.setMulticastPort(config.port);
			discoveryOther.setDiscoverIntervalMs(config.interval);
			discoveryOther.setMulticastAddress(config.address);
			discoveryOther.setMulticastPort(config.port);
			// Set discover response to mark flag as properly visited, then cancel the wait mechanism
			discoverySelf.setOnDiscover(c -> {
				if (c.getIdentifier().equals(otherClient.getIdentifier())) {
					visited.set(true);
					lock.countDown();
				}
			});
			// Start both discovery tasks
			discoverySelf.start();
			discoveryOther.start();
			// Wait until we see the discovered client
			lock.await(10, TimeUnit.SECONDS);
			// Cleanup
			discoverySelf.stop();
			discoveryOther.stop();
		}
		// Assert we saw something discovered
		assertTrue(visited.get());
	}

	@SuppressWarnings("unused")
	static Stream<DiscoveryConfig> provideConfig() {
		return Stream.of(
				new DiscoveryConfig(DEFAULT_DISCOVER_INTERVAL_MS, DEFAULT_MULTICAST_ADDRESS, DEFAULT_MULTICAST_PORT),
				new DiscoveryConfig(DEFAULT_DISCOVER_INTERVAL_MS / 2, DEFAULT_MULTICAST_ADDRESS, DEFAULT_MULTICAST_PORT + 1),
				new DiscoveryConfig(DEFAULT_DISCOVER_INTERVAL_MS * 2, DEFAULT_MULTICAST_ADDRESS, DEFAULT_MULTICAST_PORT + 2),
				new DiscoveryConfig(DEFAULT_DISCOVER_INTERVAL_MS / 2, DEFAULT_MULTICAST_ADDRESS, DEFAULT_MULTICAST_PORT + 3),
				new DiscoveryConfig(DEFAULT_DISCOVER_INTERVAL_MS * 2, DEFAULT_MULTICAST_ADDRESS, DEFAULT_MULTICAST_PORT + 4),
				new DiscoveryConfig(DEFAULT_DISCOVER_INTERVAL_MS / 2, DEFAULT_MULTICAST_ADDRESS, DEFAULT_MULTICAST_PORT + 5)
		);
	}

	static class DiscoveryConfig {
		private final long interval;
		private final String address;
		private final int port;

		public DiscoveryConfig(long interval, String address, int port) {
			this.interval = interval;
			this.address = address;
			this.port = port;
		}
	}
}
