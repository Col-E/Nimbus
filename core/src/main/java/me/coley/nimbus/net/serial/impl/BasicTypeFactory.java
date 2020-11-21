package me.coley.nimbus.net.serial.impl;

import me.coley.nimbus.net.serial.TypeFactory;
import me.coley.nimbus.net.serial.TypeSerializer;

import java.util.HashMap;
import java.util.Map;

/**
 * Basic type factory implementation.
 *
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public class BasicTypeFactory<S> implements TypeFactory<S> {
	private final Map<Class<?>, TypeSerializer<?, S>> serializers = new HashMap<>();

	@Override
	public Map<Class<?>, TypeSerializer<?, S>> getSerializers() {
		return serializers;
	}

	@Override
	public <T> void addSerializer(Class<T> type, TypeSerializer<?, S> serializer) {
		serializers.put(type, serializer);
	}
}
