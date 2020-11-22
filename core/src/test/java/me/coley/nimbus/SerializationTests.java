package me.coley.nimbus;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import me.coley.nimbus.stuff.ConnectionType;
import me.coley.nimbus.stuff.ListWrapper;
import me.coley.nimbus.stuff.ServerPacket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SerializationTests {
	private final Nimbus ctx = new Nimbus();

	@BeforeEach
	void setupCustomTypeSerial() {
		ctx.getSerialization().addTypeConverter(ServerPacket.class, new Serializer<ServerPacket>() {
			@Override
			public void write(Kryo kryo, Output output, ServerPacket object) {
				output.writeByte(object.getType().ordinal());
				output.writeString(object.getIp());
				output.writeInt(object.getPort());
			}

			@Override
			public ServerPacket read(Kryo kryo, Input input, Class<? extends ServerPacket> type) {
				int ordinal = input.readByte();
				String ip = input.readString();
				int port = input.readInt();
				ConnectionType connectionType = ConnectionType.values()[ordinal];
				return new ServerPacket(connectionType, ip, port);
			}
		});
	}

	@Test
	void testConcreteType() {
		// Do serial/deserial of the type, given a few different instances
		ServerPacket[] packets = new ServerPacket[]{
				new ServerPacket(ConnectionType.SSH, "localhost", 25565),
				new ServerPacket(ConnectionType.HTTP, "198.10.3.5", 80),
				new ServerPacket(ConnectionType.FTP, "127.0.0.1", 21)
		};
		for (ServerPacket original : packets) {
			byte[] serialized = ctx.getSerialization().serializeObject(original);
			ServerPacket deserialized = ctx.getSerialization().deserializeObject(serialized, ServerPacket.class);
			assertEquals(original, deserialized);
		}
	}

	@Test
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
		byte[] serializedStrings = ctx.getSerialization().serializeObject(strings);
		ListWrapper<String> deserializedStrings = ctx.getSerialization().deserializeObject(serializedStrings, ListWrapper.class);
		assertEquals(strings, deserializedStrings);
		// Deserialize int list
		byte[] serializedInts = ctx.getSerialization().serializeObject(ints);
		ListWrapper<Integer> deserializedInts = ctx.getSerialization().deserializeObject(serializedInts, ListWrapper.class);
		assertEquals(ints, deserializedInts);
		// Deserialize packet list
		byte[] serializedPackets = ctx.getSerialization().serializeObject(packets);
		ListWrapper<ServerPacket> deserializedPackets = ctx.getSerialization().deserializeObject(serializedPackets, ListWrapper.class);
		assertEquals(packets, deserializedPackets);
	}
}
