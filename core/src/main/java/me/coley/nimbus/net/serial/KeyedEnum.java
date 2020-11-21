package me.coley.nimbus.net.serial;

/**
 * Serializable enums must extend this type and assign each entry a key value.
 * This combats the case for different key ordinals should there be version conflicts in the classes.
 *
 * @author Matt Coley
 */
public interface KeyedEnum {
	/**
	 * @return Enum instance identifier.
	 */
	byte getEnumKey();

	/**
	 * Utility to register the current enum value in the {@link EnumIdLookup lookup}.
	 * Should be called in each implementing enum value constructor.
	 */
	default void register() {
		Enum<?> self = (Enum<?>) this;
		EnumIdLookup.register(getClass(), getEnumKey(), self.name());
	}
}
