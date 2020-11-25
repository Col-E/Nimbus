package me.coley.nimbus.serial;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation applied to fields indicating the order by which it should be serialized.
 * Lower values appear first in serialization.
 *
 * @author Matt Coley
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Index {
	int value();
}
