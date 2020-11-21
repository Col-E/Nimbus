package me.coley.nimbus.net.serial.impl.binary;

import me.coley.nimbus.net.serial.ObjectWriter;
import me.coley.nimbus.net.serial.TypeFactory;
import me.coley.nimbus.util.ThrowingBiConsumer;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
	public <T> void setList(String key, List<T> value, Class<T> elementType) {
		try {
			List<byte[]> serializedValue = new ArrayList<>();
			for (T element : value)
				serializedValue.add(serializeListElement(elementType, element));
			// Note that instead of using the normal list class, we operate via a wrapper which lets us store
			// the original type of the list so context-less serializers can look up the data later.
			getOrCreateMap(ListWrapper.class).put(key, new ListWrapper<>(serializedValue, elementType));
		} catch (IOException ex) {
			throw new IllegalArgumentException("Unable to serialize list type: " + elementType.getName(), ex);
		}
	}

	private <T> byte[] serializeListElement(Class<T> elementType, T element) throws IOException {
		// Check if element type is non-standard
		if (!isSimpleType(elementType))
			return getTypeFactory().serialize(elementType, element);
		// Use known serial patterns
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try (DataOutputStream dos = new DataOutputStream(baos)) {
			if (elementType.equals(boolean.class) || elementType.equals(Boolean.class)) {
				dos.writeBoolean((Boolean) element);
			} else if (elementType.equals(byte.class) || elementType.equals(Byte.class)) {
				dos.writeByte((Byte) element);
			} else if (elementType.equals(char.class) || elementType.equals(Character.class)) {
				dos.writeChar((Integer) element);
			} else if (elementType.equals(int.class) || elementType.equals(Integer.class)) {
				dos.writeInt((Integer) element);
			} else if (elementType.equals(float.class) || elementType.equals(Float.class)) {
				dos.writeFloat((Float) element);
			} else if (elementType.equals(double.class) || elementType.equals(Double.class)) {
				dos.writeDouble((Double) element);
			} else if (elementType.equals(String.class)) {
				dos.writeUTF((String) element);
			} else if (elementType.equals(byte[].class)) {
				dos.write((byte[]) element);
			} else  {
				throw new IllegalStateException("Unhandled list type: " + elementType.getName());
			}
		}
		return baos.toByteArray();
	}

	@Override
	@SuppressWarnings("rawtypes")
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
			writeValuesOfType(dos, ListWrapper.class, KIND_LIST, -1, (ThrowingBiConsumer<DataOutputStream, ListWrapper>) this::writeList);
			writeValuesOfType(dos, byte[].class, KIND_BYTES, -1, bytesWriter);
			writeValuesOfType(dos, byte[].class, KIND_STRUCT, -1, bytesWriter);
		}
		return baos.toByteArray();
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	private void writeList(DataOutputStream dos, ListWrapper rawList) throws IOException {
		// Write:
		//  - kind
		//  - list size
		//  - entries:
		//    - size
		//    - value
		dos.writeByte(SIMPLE_TYPES.getOrDefault(rawList.elementType, KIND_STRUCT));
		dos.writeInt(rawList.serialList.size());
		for (byte[] element : (List<byte[]>) rawList.serialList) {
			dos.writeInt(element.length);
			dos.write(element, 0, element.length);
		}
	}

	private <V> void writeValuesOfType(DataOutputStream dos, Class<V> key, int dataKind, int dataSize, BiConsumer<DataOutputStream, V> writer) throws IOException {
		for (Map.Entry<String, V> entry : getMap(key).entrySet()) {
			// Write:
			//  - key
			//  - kind
			//  - entry-size
			//  - entry-value
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

	/**
	 * Used to associate a stored serialized list with its original element type.
	 *
	 * @param <T>
	 * 		Generic element type.
	 */
	private static class ListWrapper<T> {
		private final List<byte[]> serialList;
		private final Class<T> elementType;

		public ListWrapper(List<byte[]> serialList, Class<T> elementType) {
			this.serialList = serialList;
			this.elementType = elementType;
		}
	}
}
