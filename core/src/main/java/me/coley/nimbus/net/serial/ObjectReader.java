package me.coley.nimbus.net.serial;

import java.io.IOException;

/**
 * Object deserializer interface.
 *
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public interface ObjectReader<S> extends SerialEntity<S> {
	/**
	 * This method reads the content of the input and stores the data necessary for later lookup.
	 *
	 * @param input
	 * 		Input to read from.
	 *
	 * @throws IOException
	 * 		When the input cannot be read.
	 */
	void read(S input) throws IOException;

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code boolean} value.
	 */
	boolean getBoolean(String key);

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code byte} value.
	 */
	byte getByte(String key);

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code char} value.
	 */
	char getCharacter(String key);

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code short} value.
	 */
	short getShort(String key);

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code int} value.
	 */
	int getInt(String key);

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code float} value.
	 */
	float getFloat(String key);

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code double} value.
	 */
	double getDouble(String key);

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code long} value.
	 */
	long getLong(String key);

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code byte[]} value.
	 */
	byte[] getBytes(String key);

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code String} value.
	 */
	String getString(String key);

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated {@code enum} value.
	 */
	default <E extends KeyedEnum> E getEnum(String key, Class<E> type) {
		int identifier = getByte(key);
		return EnumIdLookup.get(type, identifier);
	}

	/**
	 * @param key
	 * 		Value key.
	 *
	 * @return Associated generic value.
	 */
	<T> T getType(String key, Class<T> type);
}
