package me.coley.nimbus.compiler.model;

import me.coley.nimbus.compiler.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Tracking general class information to be used to generate source files.
 *
 * @author Matt Coley
 */
public class ClassModel {
	private final List<String> interfaces = new ArrayList<>();
	private final List<FieldModel> fields = new ArrayList<>();
	private final List<MethodModel> methods = new ArrayList<>();
	private final List<ClassModel> innerClasses = new ArrayList<>();
	private final Stack<Scope> scope;
	private final String name;
	private final Type type;
	private String superName;

	/**
	 * @param type
	 * 		Type of IDL class.
	 * @param scope
	 * 		Class scope, including packages and outer class identifiers.
	 * @param name
	 * 		Class name.
	 */
	public ClassModel(Type type, Stack<Scope> scope, String name) {
		this.type = type;
		this.scope = scope;
		this.name = name;
	}

	/**
	 * @return Class name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return Extended class name.
	 * May be {@code null}.
	 */
	public String getSuperName() {
		return superName;
	}

	/**
	 * @param superName
	 * 		Extended class name.
	 */
	public void setSuperName(String superName) {
		this.superName = superName;
	}

	/**
	 * @return {@code true} if the parent {@code extends} a type.
	 */
	public boolean hasParent() {
		return superName != null;
	}

	/**
	 * @return Class scope, including packages and outer class identifiers.
	 */
	public Stack<Scope> getScope() {
		return scope;
	}

	/**
	 * @return Type of IDL class.
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @return Interface names implemented.
	 */
	public List<String> getInterfaces() {
		return interfaces;
	}

	/**
	 * @return Field definitions.
	 */
	public List<FieldModel> getFields() {
		return fields;
	}

	/**
	 * @return Method definitions.
	 */
	public List<MethodModel> getMethods() {
		return methods;
	}

	/**
	 * @return Inner class models.
	 */
	public List<ClassModel> getInnerClasses() {
		return innerClasses;
	}

	@Override
	public String toString() {
		return name;
	}

	/**
	 * Model type.
	 *
	 * @author Matt Coley
	 */
	public enum Type {
		ENUM, INTERFACE, EXCEPTION, DATA
	}
}
