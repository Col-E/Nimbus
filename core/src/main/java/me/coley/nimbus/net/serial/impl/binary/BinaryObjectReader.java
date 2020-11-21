package me.coley.nimbus.net.serial.impl.binary;

import me.coley.nimbus.net.serial.ObjectReader;
import me.coley.nimbus.net.serial.TypeFactory;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	@SuppressWarnings("unchecked")
	public <T> List<T> getList(String key, Class<T> elementType) {
		if (isSimpleType(elementType))
			return (List<T>) getMap(List.class).get(key);
		// Must convert type of stored entries
		try {
			List<T> list = new ArrayList<>();
			List<byte[]> raw = getMap(List.class).get(key);
			for (byte[] entry : raw)
				list.add(getTypeFactory().deserialize(elementType, entry));
			return list;
		} catch (IOException ex) {
			throw new IllegalArgumentException("Unable to deserialize type in list: " + elementType.getName(), ex);
		}
	}

	private void read(DataInputStream dis) throws IOException {
		int size = dis.readInt();
		for (int i = 0; i < size; i++) {
			String name = dis.readUTF();
			int kind = dis.readByte();
			int length = dis.readInt();
			Object value = readValue(dis, kind, length);
			switch (kind) {
				case KIND_BOOL:
					getOrCreateMap(boolean.class).put(name, (Boolean) value);
					break;
				case KIND_BYTE:
					getOrCreateMap(byte.class).put(name, (Byte) value);
					break;
				case KIND_CHAR:
					getOrCreateMap(char.class).put(name, (Character) value);
					break;
				case KIND_SHORT:
					getOrCreateMap(short.class).put(name, (Short) value);
					break;
				case KIND_INT:
					getOrCreateMap(int.class).put(name, (Integer) value);
					break;
				case KIND_FLOAT:
					getOrCreateMap(float.class).put(name, (Float) value);
					break;
				case KIND_DOUBLE:
					getOrCreateMap(double.class).put(name, (Double) value);
					break;
				case KIND_LONG:
					getOrCreateMap(long.class).put(name, (Long) value);
					break;
				case KIND_UTF:
					getOrCreateMap(String.class).put(name, (String) value);
					break;
				case KIND_BYTES:
				case KIND_STRUCT:
					getOrCreateMap(byte[].class).put(name, (byte[]) value);
					break;
				case KIND_LIST:
					getOrCreateMap(List.class).put(name, (List<?>) value);
					break;
			}
		}
	}

	@SuppressWarnings("ResultOfMethodCallIgnored")
	private Object readValue(DataInputStream dis, int kind, int length) throws IOException {
		switch (kind) {
			case KIND_BOOL:
				return dis.readBoolean();
			case KIND_BYTE:
				return dis.readByte();
			case KIND_CHAR:
				return dis.readChar();
			case KIND_SHORT:
				return dis.readShort();
			case KIND_INT:
				return dis.readInt();
			case KIND_FLOAT:
				return dis.readFloat();
			case KIND_DOUBLE:
				return dis.readDouble();
			case KIND_LONG:
				return dis.readLong();
			case KIND_UTF:
				return dis.readUTF();
			case KIND_BYTES:
			case KIND_STRUCT:
				byte[] buffer = new byte[length];
				dis.read(buffer);
				return buffer;
			case KIND_LIST:
				int type = dis.readByte();
				int entries = dis.readInt();
				List<Object> list = new ArrayList<>(entries);
				for (int j = 0; j < entries; j++) {
					int entryLength = dis.readInt();
					list.add(readValue(dis, type, entryLength));
				}
				return list;
		}
		throw new IllegalStateException("Unknown value kind: " + kind);
	}
}
