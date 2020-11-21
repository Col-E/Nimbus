package me.coley.nimbus.net.serial;

/**
 * Interface applied to classes that require access to serialization utilities.
 *
 * @param <S>
 * 		Serialized intermediate type.
 *
 * @author Matt Coley
 */
public interface SerialEntity<S> {
	/**
	 * @return The type factory of the current network participant.
	 */
	TypeFactory<S> getTypeFactory();
}
