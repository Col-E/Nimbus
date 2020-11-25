package me.coley.nimbus.config;

import org.objenesis.Objenesis;

import java.util.HashMap;

/**
 * Serialization related configuration values.
 *
 * @author Matt Coley
 */
public class SerialConfig extends HashMap<String, Object> {
	private static final String USE_ANNOTATED_INDICES = "annotation-index";
	private static final String USE_CTOR_BYPASS = "bypass-ctor";

	/**
	 * Sets the state of deserialization initialization bypassing requirement for having a no-argument constructor.
	 *
	 * @param value
	 * 		New constructor bypass value.
	 */
	public void setBypassConstructor(boolean value) {
		put(USE_CTOR_BYPASS, value);
	}

	/**
	 * In most common deserialization mechanisms, the type instance is provided and values are set afterwards.
	 * In the context of Java, reflection is typically used to call the no-arg constructor, or error out if none exists.
	 * This uses {@link Objenesis} to bypass the need to declare a no-arg constructor.
	 * For data classes, this will result in objects being {@code null} and primitives set to {@code 0}.
	 *
	 * @return {@code true} when supporting bypassing requirement of serialized types to declare a no-argument constructor.
	 */
	public boolean doBypassConstructor() {
		return (boolean) getOrDefault(USE_CTOR_BYPASS, true);
	}

	/**
	 * Sets the state of annotation indexing of serialized types.
	 *
	 * @param value
	 * 		New annotation indexing usage value.
	 */
	public void setUseAnnotatedIndices(boolean value) {
		put(USE_ANNOTATED_INDICES, value);
	}

	/**
	 * Annotated indices on serialized types allow for different layouts of data-types on the publish and subscribe ends.
	 * As long as the fields ordered by index match types, the serialization process will succeed.
	 * <br>
	 * If no annotations are present the default serialization is used as a fallback.
	 *
	 * @return {@code true} when supporting annotation indexing of serialized type.
	 */
	public boolean doUseAnnotatedIndices() {
		return (boolean) getOrDefault(USE_ANNOTATED_INDICES, false);
	}
}
