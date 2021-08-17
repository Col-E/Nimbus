package me.coley.nimbus.discovery;

import me.coley.nimbus.NimbusConsts;
import org.jgroups.Header;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * JGroups header for {@link NimbusID} broadcasts.
 *
 * @author Matt Coley
 */
public class NimbusIDHeader extends Header {
	public static final short MAGIC_ID = NimbusConsts.HEADER_ID;
	private NimbusID id;

	/**
	 * Attach an identity value to the header.
	 *
	 * @param id
	 * 		Identity value.
	 *
	 * @return Header instance with ID.
	 */
	public NimbusIDHeader withId(NimbusID id) {
		Objects.requireNonNull(id, "ID cannot be set to null header!");
		this.id = id;
		return this;
	}

	/**
	 * @return Identity value.
	 */
	public NimbusID getId() {
		return id;
	}

	@Override
	public short getMagicId() {
		return MAGIC_ID;
	}

	@Override
	public Supplier<? extends Header> create() {
		return (Supplier<Header>) NimbusIDHeader::new;
	}

	@Override
	public int serializedSize() {
		Objects.requireNonNull(id, "ID must not be null in header!");
		// 1:Bool  = Is IPv6 (Used to determine array length)
		// X:Array = Address
		// 4:Int   = Application ID
		return 1 + id.getNetworkAddress().length + 4;
	}

	@Override
	public void writeTo(DataOutput out) throws IOException {
		Objects.requireNonNull(id, "ID must not be null in header!");
		out.writeBoolean(id.isNetworkAddressIPv6());
		out.write(id.getNetworkAddress());
		out.writeInt(id.getApplicationId());
	}

	@Override
	public void readFrom(DataInput in) throws IOException {
		boolean isIPv6 = in.readBoolean();
		int addressSize = isIPv6 ? 16 : 4;
		byte[] address = new byte[addressSize];
		in.readFully(address);
		int appId = in.readInt();
		id = new NimbusID(address, appId);
	}
}
