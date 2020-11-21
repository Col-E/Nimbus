package me.coley.nimbus.net.serial.impl.binary;

import me.coley.nimbus.net.serial.SerialEntity;
import me.coley.nimbus.net.serial.TypeFactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Common base for binary serial implementation.
 *
 * @author Matt Coley
 */
public class BinaryIO implements SerialEntity<byte[]> {
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
}
