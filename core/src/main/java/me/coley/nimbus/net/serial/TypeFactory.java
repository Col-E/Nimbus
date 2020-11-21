package me.coley.nimbus.net.serial;

import java.io.IOException;
import java.util.Map;

/**
 * Factory responsible for maintaining serialization/deserialization of multiple types.
 *
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public interface TypeFactory<S> {
	/**
	 * @return Map of classes to their serializers.
	 */
	Map<Class<?>, TypeSerializer<?, S>> getSerializers();

	/**
	 * @param type
	 * 		Type to associate the serializer with.
	 * @param serializer
	 * 		The serial/deserializer implementation.
	 * @param <T>
	 * 		Generic type to serialize.
	 */
	<T> void addSerializer(Class<T> type, TypeSerializer<?, S> serializer);

	/**
	 * @param type
	 * 		Type of class to fetch serializer of.
	 * @param <T>
	 * 		Generic type to serialize.
	 *
	 * @return Serializer/deserializer for the given type.
	 *
	 * @throws UnserializableException
	 * 		When no serializer instance is associated with the given type.
	 */
	@SuppressWarnings("unchecked")
	default <T> TypeSerializer<T, S> getSerializer(Class<T> type) throws UnserializableException {
		TypeSerializer<T, S> serializer = (TypeSerializer<T, S>) getSerializers().get(type);
		if (serializer == null)
			throw new UnserializableException(type);
		return serializer;
	}

	/**
	 * @param type
	 * 		Type of class to create a new instance of.
	 * @param <T>
	 * 		Generic type to create.
	 *
	 * @return New instance of the type.
	 *
	 * @throws UnserializableException
	 * 		When no serializer instance is associated with the given type.
	 */
	default <T> T create(Class<T> type) throws UnserializableException {
		return getSerializer(type).provide(type);
	}

	/**
	 * @param type
	 * 		Type of class to serialize.
	 * @param value
	 * 		Instance of type to serialize.
	 * @param <T>
	 * 		Generic type to serialize.
	 *
	 * @return Serialized representation of the instance.
	 *
	 * @throws IOException
	 * 		When no deserializer instance is associated with the given type,
	 * 		or when the value cannot be serialized.
	 */
	default <T> S serialize(Class<T> type, T value) throws IOException {
		return getSerializer(type).serialize(value);
	}

	/**
	 * @param type
	 * 		Type of class to deserialize.
	 * @param serialized
	 * 		Serialized representation of class.
	 * @param <T>
	 * 		Generic type to deserialize.
	 *
	 * @return Instance of the class, with deserialized values from the passed data.
	 *
	 * @throws IOException
	 * 		When no serializer instance is associated with the given type,
	 * 		or when the serialized data cannot be deserialized.
	 */
	default <T> T deserialize(Class<T> type, S serialized) throws IOException {
		return getSerializer(type).deserialize(serialized);
	}
}
