package me.coley.nimbus.compiler.model;

/**
 * Base member attributes.
 *
 * @author Matt Coley
 * @see FieldModel
 * @see MethodModel
 */
public class MemberModel {
	private final String name;

	/**
	 * @param name
	 * 		Member name.
	 */
	public MemberModel(String name) {
		this.name = name;
	}

	/**
	 * @return Member name.
	 */
	public String getName() {
		return name;
	}
}
