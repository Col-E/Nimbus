package me.coley.nimbus.compiler.model;

/**
 * Tracking general field information to assist {@link ClassModel}.
 *
 * @author Matt Coley
 */
public class FieldModel extends MemberModel {
	private final String type;

	/**
	 * @param name
	 * 		Field name
	 * @param type
	 * 		Field type.
	 */
	public FieldModel(String name, String type) {
		super(name);
		this.type = type;
	}

	/**
	 * @return Field type.
	 */
	public String getType() {
		return type;
	}
}
