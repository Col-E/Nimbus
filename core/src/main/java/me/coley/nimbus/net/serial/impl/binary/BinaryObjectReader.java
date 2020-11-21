package me.coley.nimbus.net.serial.impl.binary;

import me.coley.nimbus.net.serial.ObjectReader;
import me.coley.nimbus.net.serial.TypeFactory;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import static me.coley.nimbus.net.serial.impl.binary.BinaryConstants.*;

/**
 * Binary object reader.
 *
 * @author Matt Coley
 */
public class BinaryObjectReader extends BinaryIO implements ObjectReader<byte[]> {
	/**
	 * @param typeFactory
	 * 		Type factory.
	 */
	public BinaryObjectReader(TypeFactory<byte[]> typeFactory) {
		super(typeFactory);
	}

	@Override
	public void read(byte[] input) throws IOException {
		read(new DataInputStream(new ByteArrayInputStream(input)));
	}

	@Override
	public boolean getBoolean(String key) {
		return getMap(boolean.class).get(key);
	}

	@Override
	public byte getByte(String key) {
		return getMap(byte.class).get(key);
	}

	@Override
	public char getCharacter(String key) {
		return getMap(char.class).get(key);
	}

	@Override
	public short getShort(String key) {
		return getMap(short.class).get(key);
	}

	@Override
	public int getInt(String key) {
		return getMap(int.class).get(key);
	}

	@Override
	public float getFloat(String key) {
		return getMap(float.class).get(key);
	}

	@Override
	public double getDouble(String key) {
		return getMap(double.class).get(key);
	}

	@Override
	public long getLong(String key) {
		return getMap(long.class).get(key);
	}

	@Override
	public byte[] getBytes(String key) {
		return getMap(byte[].class).get(key);
	}

	@Override
	public String getString(String key) {
		return getMap(String.class).get(key);
	}

	@Override
	public <T> T getType(String key, Class<T> type) {
		try {
			byte[] raw = getBytes(key);
			if (raw == null)
				throw new IllegalArgumentException("No type value associated with key: " + key);
			return getTypeFactory().deserialize(type, raw);
		} catch (IOException ex) {
			throw new IllegalArgumentException("Unable to deserialize type: " + type.getName(), ex);
		}
	}

	@SuppressWarnings("ResultOfMethodCallIgnored")
	private void read(DataInputStream dis) throws IOException {
		int size = dis.readInt();
		for (int i = 0; i < size; i++) {
			String name = dis.readUTF();
			int kind = dis.readByte();
			int length = dis.readInt();
			switch (kind) {
				case KIND_BOOL:
					getOrCreateMap(boolean.class).put(name, dis.readBoolean());
					break;
				case KIND_BYTE:
					getOrCreateMap(byte.class).put(name, dis.readByte());
					break;
				case KIND_CHAR:
					getOrCreateMap(char.class).put(name, dis.readChar());
					break;
				case KIND_SHORT:
					getOrCreateMap(short.class).put(name, dis.readShort());
					break;
				case KIND_INT:
					getOrCreateMap(int.class).put(name, dis.readInt());
					break;
				case KIND_FLOAT:
					getOrCreateMap(float.class).put(name, dis.readFloat());
					break;
				case KIND_DOUBLE:
					getOrCreateMap(double.class).put(name, dis.readDouble());
					break;
				case KIND_LONG:
					getOrCreateMap(long.class).put(name, dis.readLong());
					break;
				case KIND_UTF:
					getOrCreateMap(String.class).put(name, dis.readUTF());
					break;
				case KIND_BYTES:
				case KIND_STRUCT:
					byte[] buffer = new byte[length];
					dis.read(buffer);
					getOrCreateMap(byte[].class).put(name, buffer);
					break;
			}
		}
	}
}
