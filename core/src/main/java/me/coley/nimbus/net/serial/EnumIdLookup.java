package me.coley.nimbus.net.serial;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum value lookup for {@link KeyedEnum} fields.
 *
 * @author Matt Coley
 */
public class EnumIdLookup {
	private static final Map<Class<? extends KeyedEnum>, Map<Integer, String>> enumStrings = new HashMap<>();

	/**
	 * Called in each {@link KeyedEnum} constructor to register the enum value.
	 *
	 * @param type
	 * 		Enum implementation.
	 * @param identifier
	 * 		Enum value identifier.
	 * @param name
	 * 		Enum value name.
	 * @param <E>
	 * 		Enum implementation type.
	 */
	public static <E extends KeyedEnum> void register(Class<E> type, int identifier, String name) {
		enumStrings.computeIfAbsent(type, (k) -> new HashMap<>())
				.put(identifier, name);
	}

	/**
	 * Fetch the enum value of the given class associated with the given identifier.
	 *
	 * @param type
	 * 		Enum implementation.
	 * @param identifier
	 * 		Enum value identifier.
	 * @param <E>
	 * 		Enum implementation type.
	 *
	 * @return Enum value.
	 */
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static <E extends KeyedEnum> E get(Class<E> type, int identifier) {
		// Get the enum entry names for the type
		Map<Integer, String> nameMap = enumStrings.get(type);
		if (nameMap == null)
			throw new IllegalStateException();
		// Get the name associated with the identifier
		String name = nameMap.get(identifier);
		return (E) Enum.valueOf((Class) type, name);
	}
}
