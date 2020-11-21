package me.coley.nimbus.net.serial;

/**
 * Basic provider for some given type.
 *
 * @param <T>
 * 		Type to provide.
 *
 * @author Matt Coley
 */
public interface TypeProvider<T> {
	/**
	 * @return Generated instance of the type.
	 */
	T provide(Class<T> type);
}
