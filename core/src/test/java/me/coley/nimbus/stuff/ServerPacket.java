package me.coley.nimbus.stuff;

import java.util.Objects;

public class ServerPacket {
	private final ConnectionType type;
	private final String ip;
	private final int port;

	public ServerPacket(ConnectionType type, String ip, int port) {
		this.type = type;
		this.ip = ip;
		this.port = port;
	}

	public ConnectionType getType() {
		return type;
	}

	public String getIp() {
		return ip;
	}

	public int getPort() {
		return port;
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
