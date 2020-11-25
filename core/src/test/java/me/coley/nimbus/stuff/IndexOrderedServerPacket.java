package me.coley.nimbus.stuff;

import com.esotericsoftware.kryo.serializers.FieldSerializer;
import me.coley.nimbus.serial.Index;

import java.util.Objects;

/**
 * This is the same as {@link ServerPacket} except the fields are annotated so they appear in a specific order.
 * <br>
 * By default, {@link FieldSerializer Kyro's field serialization} orders them alphabetically.
 */
public class IndexOrderedServerPacket {
	@Index(1)
	private final ConnectionType type;
	@Index(2)
	private final String ip;
	@Index(3)
	private final int port;

	public IndexOrderedServerPacket() {
		this(null, null, -1);
	}

	public IndexOrderedServerPacket(ConnectionType type, String ip, int port) {
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
		IndexOrderedServerPacket that = (IndexOrderedServerPacket) o;
		return port == that.port &&
				Objects.equals(ip, that.ip);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ip, port);
	}
}
