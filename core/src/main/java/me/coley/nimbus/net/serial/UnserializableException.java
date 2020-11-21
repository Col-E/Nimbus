package me.coley.nimbus.net.serial;

import java.io.IOException;

/**
 * Exception for when a type cannot be serialized/deserialized.
 *
 * @author Matt Coley
 */
public class UnserializableException extends IOException {
	private final Class<?> type;

	/**
	 * @param type
	 * 		Type that could not be serialized.
	 */
	public UnserializableException(Class<?> type) {
		super("No registered serializer for the type: " + type.getName());
		this.type = type;
	}

	/**
	 * @return Type that could not be serialized.
	 */
	public Class<?> getType() {
		return type;
	}
}
