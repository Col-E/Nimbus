package me.coley.nimbus.net.serial;

/**
 * Represents a serialized type. Implementations must be implemented with at least one no-argument constructor.
 *
 * @author Matt Coley
 */
public interface NimbusSerializable {
	/**
	 * Type identifier reserved to indicate the type should not write an identity value to the serialized output.
	 */
	int UNIDENTIFIED = -1;

	/**
	 * @param reader
	 * 		Reader to pull values from.
	 */
	void read(ObjectReader<?> reader);

	/**
	 * @param writer
	 * 		Writer to write values to.
	 */
	void write(ObjectWriter<?> writer);

	/**
	 * The object identifier value is used to indicate what type value is being serialized or deserialized.
	 * In the case where the serialization logic does not have access to an explicit type, this value can be used
	 * to differentiate between types. This is completely optional though.
	 *
	 * @return Object identifier if implemented. Otherwise {@link #UNIDENTIFIED}.
	 */
	default int getIdentifier() {
		return UNIDENTIFIED;
	}
}
