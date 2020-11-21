package me.coley.nimbus.net.serial.impl.binary;

import me.coley.nimbus.net.serial.SerialEntity;
import me.coley.nimbus.net.serial.TypeFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Common base for binary serial implementation.
 *
 * @author Matt Coley
 */
public class BinaryIO implements SerialEntity<byte[]> {
	protected static final Map<Class<?>, Byte> SIMPLE_TYPES = new HashMap<>();
	protected final Map<Class<?>, Map<String, ?>> mapOfMaps = new HashMap<>();
	private final TypeFactory<byte[]> typeFactory;

	/**
	 * @param typeFactory
	 * 		Type factory.
	 */
	public BinaryIO(TypeFactory<byte[]> typeFactory) {
		this.typeFactory = typeFactory;
	}

	/**
	 * @return Number of values registered.
	 */
	protected int countValues() {
		return mapOfMaps.values().stream()
				.mapToInt(e -> e.values().size())
				.sum();
	}

	@SuppressWarnings("unchecked")
	protected <V> Map<String, V> getMap(Class<V> key) {
		return (Map<String, V>) mapOfMaps.getOrDefault(key, Collections.emptyMap());
	}

	@SuppressWarnings("unchecked")
	protected <V> Map<String, V> getOrCreateMap(Class<V> key) {
		return (Map<String, V>) mapOfMaps.computeIfAbsent(key, k -> new HashMap<String, V>());
	}

	@Override
	public TypeFactory<byte[]> getTypeFactory() {
		return typeFactory;
	}

	protected static boolean isSimpleType(Class<?> type) {
		return SIMPLE_TYPES.containsKey(type);
	}

	static {
		SIMPLE_TYPES.put(boolean.class, BinaryConstants.KIND_BOOL);
		SIMPLE_TYPES.put(Boolean.class, BinaryConstants.KIND_BOOL);
		SIMPLE_TYPES.put(byte.class, BinaryConstants.KIND_BYTE);
		SIMPLE_TYPES.put(Byte.class, BinaryConstants.KIND_BYTE);
		SIMPLE_TYPES.put(char.class, BinaryConstants.KIND_CHAR);
		SIMPLE_TYPES.put(Character.class, BinaryConstants.KIND_CHAR);
		SIMPLE_TYPES.put(short.class, BinaryConstants.KIND_SHORT);
		SIMPLE_TYPES.put(Short.class, BinaryConstants.KIND_SHORT);
		SIMPLE_TYPES.put(int.class, BinaryConstants.KIND_INT);
		SIMPLE_TYPES.put(Integer.class, BinaryConstants.KIND_INT);
		SIMPLE_TYPES.put(float.class, BinaryConstants.KIND_FLOAT);
		SIMPLE_TYPES.put(Float.class, BinaryConstants.KIND_FLOAT);
		SIMPLE_TYPES.put(double.class, BinaryConstants.KIND_DOUBLE);
		SIMPLE_TYPES.put(Double.class, BinaryConstants.KIND_DOUBLE);
		SIMPLE_TYPES.put(long.class, BinaryConstants.KIND_LONG);
		SIMPLE_TYPES.put(Long.class, BinaryConstants.KIND_LONG);
		SIMPLE_TYPES.put(String.class, BinaryConstants.KIND_UTF);
	}
}
