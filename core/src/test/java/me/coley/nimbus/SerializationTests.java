package me.coley.nimbus;

import me.coley.nimbus.config.NetConfig;
import me.coley.nimbus.config.SerialConfig;
import me.coley.nimbus.stuff.ConnectionType;
import me.coley.nimbus.stuff.IndexOrderedServerPacket;
import me.coley.nimbus.stuff.ListWrapper;
import me.coley.nimbus.stuff.ServerPacket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class SerializationTests {
	private Nimbus nimbus;

	@BeforeEach
	void setupCustomTypeSerial() {
		nimbus = new Nimbus();
	}

	@RepeatedTest(10)
	void testConcreteType() {
		// Do serial/deserial of the type, given a few different instances
		ServerPacket[] packets = new ServerPacket[]{
				new ServerPacket(ConnectionType.SSH, "localhost", 25565),
				new ServerPacket(ConnectionType.HTTP, "198.10.3.5", 80),
				new ServerPacket(ConnectionType.FTP, "127.0.0.1", 21)
		};
		for (ServerPacket original : packets) {
			byte[] serialized = nimbus.getSerialization().serializeObject(original);
			ServerPacket deserialized = nimbus.getSerialization().deserializeObject(serialized, ServerPacket.class);
			assertEquals(original, deserialized);
		}
	}

	@RepeatedTest(10)
	@SuppressWarnings("unchecked")
	void testGenericLists() {
		ListWrapper<String> strings = new ListWrapper<>();
		strings.addValues("one", "two", "three", "four", "");
		ListWrapper<Integer> ints = new ListWrapper<>();
		ints.addValues(1, 2, 3, 4, -1);
		ListWrapper<ServerPacket> packets = new ListWrapper<>();
		packets.addValues(
				new ServerPacket(ConnectionType.SSH, "fizz", 3),
				new ServerPacket(ConnectionType.FTP, "buzz", 5),
				new ServerPacket(ConnectionType.FTP, "fizzbuzz", 15));
		// Deserialize string list
		byte[] serializedStrings = nimbus.getSerialization().serializeObject(strings);
		ListWrapper<String> deserializedStrings = nimbus.getSerialization().deserializeObject(serializedStrings, ListWrapper.class);
		assertEquals(strings, deserializedStrings);
		// Deserialize int list
		byte[] serializedInts = nimbus.getSerialization().serializeObject(ints);
		ListWrapper<Integer> deserializedInts = nimbus.getSerialization().deserializeObject(serializedInts, ListWrapper.class);
		assertEquals(ints, deserializedInts);
		// Deserialize packet list
		byte[] serializedPackets = nimbus.getSerialization().serializeObject(packets);
		ListWrapper<ServerPacket> deserializedPackets = nimbus.getSerialization().deserializeObject(serializedPackets, ListWrapper.class);
		assertEquals(packets, deserializedPackets);
	}

	@Nested
	class IndexOrdering {
		@BeforeEach
		void setupCustomTypeSerial() {
			SerialConfig serialConfig = new SerialConfig();
			serialConfig.setUseAnnotatedIndices(true);
			nimbus = new Nimbus(new NetConfig(), serialConfig);
		}

		@RepeatedTest(10)
		void testIndexedOrdering() {
			ConnectionType type = ConnectionType.SSH;
			String addr = "localhost";
			int port = 25565;
			ServerPacket standard = new ServerPacket(type, addr, port);
			IndexOrderedServerPacket indexed = new IndexOrderedServerPacket(type, addr, port);
			// Serialize
			byte[] serialized1 = nimbus.getSerialization().serializeObject(standard);
			byte[] serialized2 = nimbus.getSerialization().serializeObject(indexed);
			// Assert valid deserial
			ServerPacket deStandard = nimbus.getSerialization().deserializeObject(serialized1, ServerPacket.class);
			IndexOrderedServerPacket deIndexed = nimbus.getSerialization().deserializeObject(serialized2, IndexOrderedServerPacket.class);
			assertEquals(standard, deStandard);
			assertEquals(indexed, deIndexed);
			// Different serialized content
			int len = Math.min(serialized1.length, serialized2.length);
			for (int i = 0; i < len - 1; i++)
				if (serialized1[i] != serialized2[i])
					return;
			// Fail if same content
			fail("Serialized arrays were the same despite one supposed to have different order declared by annotations!");
		}
	}
}
