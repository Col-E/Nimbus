package me.coley.nimbus;

import me.coley.nimbus.config.NetConfig;
import me.coley.nimbus.config.SerialConfig;
import me.coley.nimbus.stuff.ConnectionType;
import me.coley.nimbus.stuff.IndexOrderedServerPacket;
import me.coley.nimbus.stuff.ListWrapper;
import me.coley.nimbus.stuff.ServerPacket;
import me.coley.nimbus.topic.Topic;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

public class TopicTests {
	private static final NetConfig NET_CONFIG = new NetConfig();
	private final Nimbus nimbus = new Nimbus(NET_CONFIG, new SerialConfig());
	private final Client client = nimbus.createClient();

	static {
		NET_CONFIG.setDoHandleSelfPublishedMessages(true);
	}

	@Test
	@SuppressWarnings("rawtypes")
	void testSendingXOrderedPackets() throws Exception {
		int count = 25;
		AtomicInteger expected = new AtomicInteger(0);
		AtomicBoolean visited = new AtomicBoolean();
		CountDownLatch lock = new CountDownLatch(count);
		Topic<ServerPacket> topic = client.getTopicManager().createTopic(ServerPacket.class);
		Topic<ListWrapper> topicAlt = client.getTopicManager().createTopic(ListWrapper.class);
		synchronized (lock) {
			topic.setListener(packet -> {
				// Assert that we see each packet coming in order
				assertEquals(expected.getAndAdd(1), packet.getPort());
				// Mark that we have been visited
				visited.set(true);
				lock.countDown();
			});
			topicAlt.setListener(packetAlt -> {
				fail("We should not receive any alternative packet types!");
			});
			topic.open();
			topicAlt.open();
			// Send messages, indicate order of packet sending with the "port" value
			for (int i = 0; i < count; i++)
				topic.publish(new ServerPacket(ConnectionType.HTTP, "localhost", i));
			// Wait until we see the data
			lock.await(10, TimeUnit.SECONDS);
			// Cleanup
			topic.close();
			topicAlt.close();
		}
		// Assert we saw something
		assertTrue(visited.get(), "Topic failed to receive any messages!");
		assertEquals(0, lock.getCount(), "Topic failed to receive expected number of messages!");
	}
}
