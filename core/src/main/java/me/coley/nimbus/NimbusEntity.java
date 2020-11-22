package me.coley.nimbus;

/**
 * Interface applied to classes that require access to the core {@link Nimbus} type.
 *
 * @author Matt Coley
 */
public interface NimbusEntity {
	/**
	 * @return Nimbus context.
	 */
	Nimbus getNimbus();
}
