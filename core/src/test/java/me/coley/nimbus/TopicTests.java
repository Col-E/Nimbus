package me.coley.nimbus;

import me.coley.nimbus.config.NetConfig;
import me.coley.nimbus.config.SerialConfig;
import me.coley.nimbus.stuff.ConnectionType;
import me.coley.nimbus.stuff.ServerPacket;
import me.coley.nimbus.topic.Topic;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TopicTests {
	private static final NetConfig NET_CONFIG = new NetConfig();
	private final Nimbus nimbus = new Nimbus(NET_CONFIG, new SerialConfig());

	static {
		NET_CONFIG.setDoHandleSelfPublishedMessages(true);
	}

	@Test
	void test() throws Exception {
		int count = 10;
		AtomicBoolean visited = new AtomicBoolean();
		CountDownLatch lock = new CountDownLatch(count);
		Topic<ServerPacket> topic = Topic.createTopic(nimbus, ServerPacket.class);
		synchronized (lock) {
			topic.setListener(packet -> {
				visited.set(true);
				lock.countDown();
			});
			topic.open();
			// Send messages
			for (int i = 0; i < count; i++)
				topic.publish(new ServerPacket(ConnectionType.HTTP, "localhost", 80));
			// Wait until we see the data
			lock.await(10, TimeUnit.SECONDS);
			// Cleanup
			topic.close();
		}
		// Assert we saw something
		assertTrue(visited.get(), "Topic failed to receive any messages!");
		assertEquals(0, lock.getCount(), "Topic failed to receive expected number of messages!");
	}
}
