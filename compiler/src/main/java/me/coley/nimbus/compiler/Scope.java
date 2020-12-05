package me.coley.nimbus.compiler;

public class Scope {
	private final ScopeType type;
	private final String name;

	public Scope(ScopeType type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getPathSeparator() {
		switch (type) {
			case PACKAGE:
				return "/";
			case CLASS:
				return "$";
			default:
				throw new IllegalStateException();
		}
	}
}