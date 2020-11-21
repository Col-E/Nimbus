package me.coley.nimbus;

import me.coley.nimbus.net.Client;
import me.coley.nimbus.net.NetContext;
import me.coley.nimbus.net.discovery.Discovery;
import me.coley.nimbus.net.serial.impl.BasicTypeFactory;
import me.coley.nimbus.net.serial.impl.binary.BinaryObjectReader;
import me.coley.nimbus.net.serial.impl.binary.BinaryObjectWriter;
import org.junit.jupiter.api.RepeatedTest;
import org.mockito.Mockito;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiscoveryTests {
	private static final NetContext<byte[]> ctx = new NetContextBuilder<byte[]>()
			.setObjectReaderFunction(ctx -> new BinaryObjectReader(ctx.getTypeFactory()))
			.setObjectWriterFunction(ctx -> new BinaryObjectWriter(ctx.getTypeFactory()))
			.setTypeFactoryFunction(ctx -> new BasicTypeFactory<>())
			.build();

	@RepeatedTest(5)
	void test() throws Exception {
		AtomicBoolean visited = new AtomicBoolean();
		CountDownLatch lock = new CountDownLatch(1);
		synchronized (lock) {
			Client<byte[]> selfClient = ctx.createClient();
			Client<byte[]> otherClient = new Client<>(ctx, "111.111.111.111");
			// Setup discovery:
			//  - Normal client (self)
			//  - Mock client (random address)
			//  - Normal client discovery should see mocked client's broadcast
			Discovery<byte[]> discoverySelf = Mockito.spy(selfClient.createDiscovery());
			Discovery<byte[]> discoveryOther = otherClient.createDiscovery();
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
			discoverySelf.stop();
			discoveryOther.stop();
		}
		// Assert we saw something discovered
		assertTrue(visited.get());
	}
}
