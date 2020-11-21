package me.coley.nimbus.net.serial;

import java.io.IOException;

/**
 * Object serializer interface.
 *
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public interface ObjectWriter<S> extends SerialEntity<S> {
	/**
	 * @return Generate output format of the stored values.
	 *
	 * @throws IOException
	 * 		When the object cannot be serialized.
	 */
	S generate() throws IOException;

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code boolean} value to write.
	 */
	void setBoolean(String key, boolean value);

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code byte} value to write.
	 */
	void setByte(String key, byte value);

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code char} value to write.
	 */
	void setCharacter(String key, char value);

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code short} value to write.
	 */
	void setShort(String key, short value);

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code int} value to write.
	 */
	void setInt(String key, int value);

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code float} value to write.
	 */
	void setFloat(String key, float value);

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code double} value to write.
	 */
	void setDouble(String key, double value);

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code long} value to write.
	 */
	void setLong(String key, long value);

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code byte[]} value to write.
	 */
	void setBytes(String key, byte[] value);

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code String} value to write.
	 */
	void setString(String key, String value);

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated {@code enum} value to write.
	 * @param <E>
	 * 		Generic enum type.
	 */
	default <E extends KeyedEnum> void setEnum(String key, E value) {
		// TODO: Replace this minimal approach with something more user friendly
		//  - Does not allow usage of 3rd party enums
		//  - But saves network space since we don't have to transfer type information
		setByte(key, value.getEnumKey());
	}

	/**
	 * @param key
	 * 		Value key.
	 * @param value
	 * 		Associated generic value to write.
	 * @param type
	 * 		Class of type.
	 * @param <T>
	 * 		Generic type.
	 */
	<T> void setType(String key, T value, Class<T> type);
}
