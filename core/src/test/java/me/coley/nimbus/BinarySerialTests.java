package me.coley.nimbus;

import me.coley.nimbus.net.NetContext;
import me.coley.nimbus.net.serial.impl.BasicTypeFactory;
import me.coley.nimbus.net.serial.impl.ContextualTypeSerializer;
import me.coley.nimbus.net.serial.impl.binary.BinaryObjectReader;
import me.coley.nimbus.net.serial.impl.binary.BinaryObjectWriter;
import me.coley.nimbus.stuff.ConnectionType;
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

}
