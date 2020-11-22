package me.coley.nimbus;

import me.coley.nimbus.discovery.Discovery;
import org.junit.jupiter.api.RepeatedTest;
import org.mockito.Mockito;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiscoveryTests {
	private final Nimbus ctx = new Nimbus();

	@RepeatedTest(5)
	void test() throws Exception {
		AtomicBoolean visited = new AtomicBoolean();
		CountDownLatch lock = new CountDownLatch(1);
		synchronized (lock) {
			Client selfClient = ctx.createClient();
			Client otherClient = new Client(ctx, "111.111.111.111");
			// Setup discovery:
			//  - Normal client (self)
			//  - Mock client (random address)
			//  - Normal client discovery should see mocked client's broadcast
			Discovery discoverySelf = Mockito.spy(selfClient.createDiscovery());
			Discovery discoveryOther = otherClient.createDiscovery();
			discoverySelf.setOnDiscover(c -> {
				if (c.getAddress().equals(otherClient.getAddress())) {
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
			// TODO: Calling stop during the thread sleep causes "InterruptedException: sleep interrupted" Discovery.announce(Discovery.java:141)
			discoverySelf.stop();
			discoveryOther.stop();
		}
		// Assert we saw something discovered
		assertTrue(visited.get());
	}
}
