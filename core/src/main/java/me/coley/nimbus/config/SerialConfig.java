package me.coley.nimbus.config;

import java.util.HashMap;

/**
 * Serialization related configuration values.
 *
 * @author Matt Coley
 */
public class SerialConfig extends HashMap<String, Object> {
	private static final String USE_ANNOTATED_INDICES = "annotation-index";

	/**
	 * Enables annotation indexing of serialized types.
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
