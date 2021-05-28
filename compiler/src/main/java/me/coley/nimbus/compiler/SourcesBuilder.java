package me.coley.nimbus.compiler;

import me.coley.nimbus.compiler.model.ClassModel;
import me.coley.nimbus.compiler.model.ClassModel.Type;

import java.util.Collection;
import java.util.Stack;

/**
 * Common source builder.
 *
 * @author Matt Coley
 */
public interface SourcesBuilder {
	/**
	 * @return Current scope of class to be generated.
	 */
	Stack<Scope> getScope();

	/**
	 * @return Temporary stack of classes being built. Aligns with {@link #getScope()}.
	 */
	Stack<ClassModel> getBuildStack();

	/**
	 * @return Popped scope.
	 */
	default Scope popScope() {
		return getScope().pop();
	}

	/**
	 * @return Popped class model.
	 */
	default ClassModel popBuild() {
		return getBuildStack().pop();
	}

	/**
	 * Pushes a new package scope to the {@link #getScope() scope stack}.
	 *
	 * @param name
	 * 		Scope name.
	 */
	default void pushPackageScope(String name) {
		getScope().push(new Scope(ScopeType.PACKAGE, name));
	}

	/**
	 * Pushes a new package scope to the {@link #getScope() scope stack}.
	 * <br>
	 * Pushes a new class model to the {@link #getBuildStack() build stack}.
	 *
	 * @param name
	 * 		Scope name.
	 */
	default void pushClassScope(Type type, String name) {
		// Update scope
		getScope().push(new Scope(ScopeType.CLASS, name));
		// Add temporary class to build stack
		Stack<Scope> classScope = new Stack<>();
		classScope.addAll(getScope());
		getBuildStack().push(new ClassModel(type, classScope, name));
	}

	/**
	 * @return Internal class name based on {@link #getScope() scope stack}.
	 */
	default String getScopePath() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < getScope().size(); i++) {
			Scope scope = getScope().get(i);
			sb.append(scope);
			if (i <= getScope().size() - 1) {
				sb.append(scope.getPathSeparator());
			}
		}
		return sb.toString();
	}

	/**
	 * @return Generated models.
	 */
	Collection<ClassModel> getModels();
}
