package me.coley.nimbus;

import me.coley.nimbus.net.NetContext;
import me.coley.nimbus.net.serial.impl.BasicTypeFactory;
import me.coley.nimbus.net.serial.impl.ContextualTypeSerializer;
import me.coley.nimbus.net.serial.impl.binary.BinaryObjectReader;
import me.coley.nimbus.net.serial.impl.binary.BinaryObjectWriter;
import me.coley.nimbus.stuff.ConnectionType;
import me.coley.nimbus.stuff.ListWrapper;
import me.coley.nimbus.stuff.ServerPacket;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySerialTests {
	private final NetContext<byte[]> ctx = new NetContextBuilder<byte[]>()
			.setObjectReaderFunction(ctx -> new BinaryObjectReader(ctx.getTypeFactory()))
			.setObjectWriterFunction(ctx -> new BinaryObjectWriter(ctx.getTypeFactory()))
			.setTypeFactoryFunction(ctx -> new BasicTypeFactory<>())
			.build();

	@Test
	void testPacket() throws IOException {
		// Add support for the type
		ctx.getTypeFactory().addSerializer(ServerPacket.class,
				new ContextualTypeSerializer<>(ctx, ServerPacket.class, ServerPacket::new));
		// Do serial/deserial of the type, given a few different instances
		ServerPacket[] packets = new ServerPacket[] {
				new ServerPacket(ConnectionType.SSH, "localhost", 25565),
				new ServerPacket(ConnectionType.HTTP, "198.10.3.5", 80),
				new ServerPacket(ConnectionType.FTP, "127.0.0.1", 21)
		};
		for (ServerPacket original : packets) {
			byte[] serialized = ctx.serializeObject(original);
			ServerPacket deserialized = ctx.deserializeObject(serialized, ServerPacket.class);
			// Validate
			assertEquals(original, deserialized);
		}
	}

	@Test
	void testLists() throws IOException {
		StringList strings = new StringList();
		strings.addValues("one", "two", "three", "four", "");
		IntList ints = new IntList();
		ints.addValues(1, 2, 3, 4, -1);
		PacketList packets = new PacketList();
		packets.addValues(
				new ServerPacket(ConnectionType.SSH, "fizz", 3),
				new ServerPacket(ConnectionType.FTP, "buzz", 5),
				new ServerPacket(ConnectionType.FTP, "fizzbuzz", 15));
		// Add support for the types
		ctx.getTypeFactory().addSerializer(StringList.class,
				new ContextualTypeSerializer<>(ctx, StringList.class, StringList::new));
		ctx.getTypeFactory().addSerializer(IntList.class,
				new ContextualTypeSerializer<>(ctx, IntList.class, IntList::new));
		ctx.getTypeFactory().addSerializer(PacketList.class,
				new ContextualTypeSerializer<>(ctx, PacketList.class, PacketList::new));
		ctx.getTypeFactory().addSerializer(ServerPacket.class,
				new ContextualTypeSerializer<>(ctx, ServerPacket.class, ServerPacket::new));
		// Deserialize lists
		byte[] serializedStrings = ctx.serializeObject(strings);
		StringList deserializedStrings = ctx.deserializeObject(serializedStrings, StringList.class);
		assertEquals(strings, deserializedStrings);
		byte[] serializedInts = ctx.serializeObject(ints);
		IntList deserializedInts = ctx.deserializeObject(serializedInts, IntList.class);
		assertEquals(ints, deserializedInts);
		byte[] serializedPackets = ctx.serializeObject(packets);
		PacketList deserializedPackets = ctx.deserializeObject(serializedPackets, PacketList.class);
		assertEquals(packets, deserializedPackets);
	}

	static class StringList extends ListWrapper<String> {
		@Override
		public Class<String> getElementType() {
			return String.class;
		}
	}

	static class IntList extends ListWrapper<Integer> {
		@Override
		public Class<Integer> getElementType() {
			return int.class;
		}
	}

	static class PacketList extends ListWrapper<ServerPacket> {
		@Override
		public Class<ServerPacket> getElementType() {
			return ServerPacket.class;
		}
	}
}
