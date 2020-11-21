package me.coley.nimbus.net.serial;

import java.io.IOException;

/**
 * Class to handle serialization/deserialization of a given type.
 *
 * @param <T>
 * 		Type to serialize.
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public interface TypeSerializer<T, S> extends TypeProvider<T> {
	/**
	 * @param value
	 * 		Value to serialize.
	 *
	 * @return Serialized representation of a class.
	 *
	 * @throws IOException
	 * 		When the value cannot be serialized.
	 */
	S serialize(T value) throws IOException;

	/**
	 * @param data
	 * 		Serialized representation of a class.
	 *
	 * @return Instance of the class with deserialized values.
	 *
	 * @throws IOException
	 * 		When the value cannot be deserialized.
	 */
	T deserialize(S data) throws IOException;
}
