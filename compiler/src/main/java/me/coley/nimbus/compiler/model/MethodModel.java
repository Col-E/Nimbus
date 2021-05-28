package me.coley.nimbus.compiler.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Tracking general method information to assist {@link ClassModel}.
 *
 * @author Matt Coley
 */
public class MethodModel extends MemberModel {
	private final List<ParameterModel> parameters = new ArrayList<>();
	private final List<String> exceptions = new ArrayList<>();
	private final String returnType;

	/**
	 * @param name
	 * 		Method name.
	 * @param returnType
	 * 		Method return type.
	 */
	public MethodModel(String name, String returnType) {
		super(name);
		this.returnType = returnType;
	}

	/**
	 * @return Method return type.
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * @return Method parameters.
	 */
	public List<ParameterModel> getParameters() {
		return parameters;
	}

	/**
	 * @return Method thrown exceptions.
	 */
	public List<String> getExceptions() {
		return exceptions;
	}

	/**
	 * Adds a parameter to the method.
	 *
	 * @param name
	 * 		Parameter name.
	 * @param type
	 * 		Parameter type.
	 */
	public void addParameter(String name, String type) {
		getParameters().add(new ParameterModel(name, type));
	}

	/**
	 * Adds an exception to the method.
	 *
	 * @param type
	 * 		Exception name.
	 */
	public void addException(String type) {
		getExceptions().add(type);
	}
}
