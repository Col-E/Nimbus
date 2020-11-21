package me.coley.nimbus.net.serial.impl.binary;

import me.coley.nimbus.net.serial.ObjectWriter;
import me.coley.nimbus.net.serial.TypeFactory;
import me.coley.nimbus.util.ThrowingBiConsumer;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.function.BiConsumer;

import static me.coley.nimbus.net.serial.impl.binary.BinaryConstants.*;

/**
 * Binary object writer.
 *
 * @author Matt Coley
 */
public class BinaryObjectWriter extends BinaryIO implements ObjectWriter<byte[]> {
	/**
	 * @param typeFactory
	 * 		Type factory.
	 */
	public BinaryObjectWriter(TypeFactory<byte[]> typeFactory) {
		super(typeFactory);
	}

	@Override
	public void setBoolean(String key, boolean value) {
		getOrCreateMap(boolean.class).put(key, value);
	}

	@Override
	public void setByte(String key, byte value) {
		getOrCreateMap(byte.class).put(key, value);
	}

	@Override
	public void setCharacter(String key, char value) {
		getOrCreateMap(char.class).put(key, value);
	}

	@Override
	public void setShort(String key, short value) {
		getOrCreateMap(short.class).put(key, value);
	}

	@Override
	public void setInt(String key, int value) {
		getOrCreateMap(int.class).put(key, value);
	}

	@Override
	public void setFloat(String key, float value) {
		getOrCreateMap(float.class).put(key, value);
	}

	@Override
	public void setDouble(String key, double value) {
		getOrCreateMap(double.class).put(key, value);
	}

	@Override
	public void setLong(String key, long value) {
		getOrCreateMap(long.class).put(key, value);
	}

	@Override
	public void setBytes(String key, byte[] value) {
		getOrCreateMap(byte[].class).put(key, value);
	}

	@Override
	public void setString(String key, String value) {
		getOrCreateMap(String.class).put(key, value);
	}

	@Override
	public <T> void setType(String key, T value, Class<T> type) {
		try {
			byte[] serialized = getTypeFactory().serialize(type, value);
			setBytes(key, serialized);
		} catch (IOException ex) {
			throw new IllegalArgumentException("Unable to serialize type: " + type.getName(), ex);
		}
	}

	@Override
	public byte[] generate() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try (DataOutputStream dos = new DataOutputStream(baos)) {
			dos.writeInt(countValues());
			ThrowingBiConsumer<DataOutputStream, byte[]> bytesWriter = (d, b) -> dos.write(b, 0, b.length);
			writeValuesOfType(dos, boolean.class, KIND_BOOL, 1, (ThrowingBiConsumer<DataOutputStream, Boolean>) DataOutputStream::writeBoolean);
			writeValuesOfType(dos, byte.class, KIND_BYTE, 1, (ThrowingBiConsumer<DataOutputStream, Byte>) DataOutputStream::writeByte);
			writeValuesOfType(dos, char.class, KIND_CHAR, 2, (ThrowingBiConsumer<DataOutputStream, Character>) DataOutputStream::writeChar);
			writeValuesOfType(dos, short.class, KIND_SHORT, 2, (ThrowingBiConsumer<DataOutputStream, Short>) DataOutputStream::writeShort);
			writeValuesOfType(dos, int.class, KIND_INT, 4, (ThrowingBiConsumer<DataOutputStream, Integer>) DataOutputStream::writeInt);
			writeValuesOfType(dos, float.class, KIND_FLOAT, 4, (ThrowingBiConsumer<DataOutputStream, Float>) DataOutputStream::writeFloat);
			writeValuesOfType(dos, double.class, KIND_DOUBLE, 8, (ThrowingBiConsumer<DataOutputStream, Double>) DataOutputStream::writeDouble);
			writeValuesOfType(dos, long.class, KIND_LONG, 8, (ThrowingBiConsumer<DataOutputStream, Long>) DataOutputStream::writeLong);
			writeValuesOfType(dos, String.class, KIND_UTF, -1, (ThrowingBiConsumer<DataOutputStream, String>) DataOutputStream::writeUTF);
			writeValuesOfType(dos, byte[].class, KIND_BYTES, -1, bytesWriter);
			writeValuesOfType(dos, byte[].class, KIND_STRUCT, -1, bytesWriter);
		}
		return baos.toByteArray();
	}

	private <V> void writeValuesOfType(DataOutputStream dos, Class<V> key, int dataKind, int dataSize, BiConsumer<DataOutputStream, V> writer) throws IOException {
		for (Map.Entry<String, V> entry : getMap(key).entrySet()) {
			dos.writeUTF(entry.getKey());
			dos.writeByte(dataKind);
			if (dataSize > 0) {
				dos.writeInt(dataSize);
			} else {
				dos.writeInt(computeSize(writer, entry.getValue()));
			}
			writer.accept(dos, entry.getValue());
		}
	}

	private static <V> int computeSize(BiConsumer<DataOutputStream, V> writer, V value) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		writer.accept(dos, value);
		dos.close();
		baos.close();
		return baos.size();
	}
}
