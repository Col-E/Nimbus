package me.coley.nimbus.stuff;

import me.coley.nimbus.net.serial.ObjectReader;
import me.coley.nimbus.net.serial.ObjectWriter;
import me.coley.nimbus.net.serial.NimbusSerializable;

import java.util.Objects;

public class ServerPacket implements NimbusSerializable {
	private ConnectionType type;
	private String ip;
	private int port;

	public ServerPacket() {}

	public ServerPacket(ConnectionType type, String ip, int port) {
		this.type = type;
		this.ip = ip;
		this.port = port;
	}

	@Override
	public void read(ObjectReader<?> reader) {
		type = reader.getEnum("type", ConnectionType.class);
		ip = reader.getString("ip");
		port = reader.getInt("port");
	}

	@Override
	public void write(ObjectWriter<?> writer) {
		writer.setEnum("type", type);
		writer.setString("ip", ip);
		writer.setInt("port", port);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ServerPacket that = (ServerPacket) o;
		return port == that.port &&
				Objects.equals(ip, that.ip);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ip, port);
	}
}
