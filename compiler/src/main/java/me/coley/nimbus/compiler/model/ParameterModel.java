package me.coley.nimbus.compiler.model;

/**
 * Parameter information.
 *
 * @author Matt Coley
 * @see MethodModel
 */
public class ParameterModel extends MemberModel {
	private final String type;

	/**
	 * @param name
	 * 		Parameter name.
	 * @param type
	 * 		Parameter type.
	 */
	public ParameterModel(String name, String type) {
		super(name);
		this.type = type;
	}

	/**
	 * @return Parameter type.
	 */
	public String getType() {
		return type;
	}
}
