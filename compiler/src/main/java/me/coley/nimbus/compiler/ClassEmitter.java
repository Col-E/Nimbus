package me.coley.nimbus.compiler;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeSpec.Builder;
import me.coley.nimbus.compiler.model.ClassModel;
import me.coley.nimbus.compiler.model.ClassModel.Type;
import me.coley.nimbus.compiler.model.FieldModel;
import me.coley.nimbus.compiler.model.MemberModel;
import me.coley.nimbus.compiler.model.MethodModel;
import me.coley.nimbus.compiler.model.ParameterModel;

import javax.lang.model.element.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Generates source files for classes described by {@link ClassModel}.
 *
 * @author Matt Coley
 */
public class ClassEmitter {
	private static final Map<String, TypeName> primitiveMap = new HashMap<>();
	private final Map<String, String> typeAlias;
	private final Collection<ClassModel> models;

	static {
		primitiveMap.put("boolean", TypeName.BOOLEAN);
		primitiveMap.put("byte", TypeName.BYTE);
		primitiveMap.put("char", TypeName.CHAR);
		primitiveMap.put("short", TypeName.SHORT);
		primitiveMap.put("int", TypeName.INT);
		primitiveMap.put("long", TypeName.LONG);
		primitiveMap.put("float", TypeName.FLOAT);
		primitiveMap.put("double", TypeName.DOUBLE);
		// not a real primitive, but treated like so by some source languages
		primitiveMap.put("string", TypeName.get(String.class));
	}

	/**
	 * @param models
	 * 		Models to generate.
	 * @param typeAlias
	 * 		Map of type name aliases.
	 */
	public ClassEmitter(Collection<ClassModel> models, Map<String, String> typeAlias) {
		this.models = models;
		this.typeAlias = typeAlias;
	}

	/**
	 * @param model
	 * 		Model to generate source for.
	 *
	 * @return Generated source.
	 */
	public String emit(ClassModel model) {
		ClassModel.Type classType = model.getType();
		String packageName = buildPackageName(model);
		String className = model.getName(); // does not include package name
		String superName = model.getSuperName(); // does not include package name
		if (classType == Type.EXCEPTION && superName == null) {
			superName = "Exception";
		}
		// Class builder
		ClassName nameX = ClassName.get(packageName, className);
		Builder builder;
		MethodSpec.Builder ctorBuilderParams = null;
		MethodSpec.Builder ctorBuilderNoParams = null;
		MethodSpec.Builder ctorBuilderExceptionParams = null;
		MethodSpec.Builder copy = null;
		switch(classType) {
			case ENUM:
				builder = TypeSpec.enumBuilder(nameX);
				break;
			case INTERFACE:
				builder = TypeSpec.interfaceBuilder(nameX);
				break;
			default:
				builder = TypeSpec.classBuilder(nameX);
				ctorBuilderParams = MethodSpec.constructorBuilder().addModifiers(Modifier.PUBLIC);
				ctorBuilderNoParams = MethodSpec.constructorBuilder().addModifiers(Modifier.PUBLIC);
				if (classType == Type.EXCEPTION) {
					ctorBuilderExceptionParams = MethodSpec.constructorBuilder()
							.addModifiers(Modifier.PUBLIC)
							.addStatement("super(message)");
				}
				copy = MethodSpec.methodBuilder("copy")
						.returns(resolveFullType(packageName, className))
						.addModifiers(Modifier.PUBLIC);
				break;
		}
		builder.addModifiers(Modifier.PUBLIC);
		// Inheritance
		if (superName != null) {
			builder.superclass(resolveFullType(packageName, superName));
		}
		for (String inter : model.getInterfaces()) {
			builder.addSuperinterface(resolveFullType(packageName, inter));
		}
		// Fields
		for (FieldModel field : model.getFields()) {
			String fieldType = mapAlias(field.getType());
			String fieldName = field.getName();
			// Add
			if (classType == Type.ENUM && fieldType.equals(className)) {
				builder.addEnumConstant(fieldName);
			} else {
				builder.addField(resolveFullType(packageName, fieldType), fieldName, Modifier.PRIVATE);
				// Build getter/setter
				MethodSpec.Builder getterBuilder = MethodSpec.methodBuilder("get" + camel(fieldName))
						.returns(resolveFullType(packageName, fieldType))
						.addModifiers(Modifier.PUBLIC)
						.addStatement("return $L", fieldName);
				MethodSpec.Builder setterBuilder = MethodSpec.methodBuilder("set" + camel(fieldName))
						.returns(TypeName.VOID)
						.addParameter(resolveFullType(packageName, fieldType), fieldName)
						.addModifiers(Modifier.PUBLIC)
						.addStatement("this.$L = $L", fieldName, fieldName);
				// Add
				MethodSpec getterSpec = getterBuilder.build();
				MethodSpec setterSpec = setterBuilder.build();
				builder.addMethod(getterSpec);
				builder.addMethod(setterSpec);
				// Update constructors
				if (ctorBuilderParams != null) {
					ctorBuilderParams.addParameter(resolveFullType(packageName, fieldType), fieldName);
					ctorBuilderParams.addStatement("this.$L = $L", fieldName, fieldName);
				}
				if (ctorBuilderExceptionParams != null) {
					ctorBuilderExceptionParams.addParameter(resolveFullType(packageName, fieldType), fieldName);
					ctorBuilderExceptionParams.addStatement("this.$L = $L", fieldName, fieldName);
				}
			}
		}
		// Constructor
		if (ctorBuilderParams != null) {
			builder.addMethod(ctorBuilderParams.build());
		}
		if (ctorBuilderExceptionParams != null) {
			ctorBuilderExceptionParams.addParameter(resolveFullType(packageName, "String"), "message");
			builder.addMethod(ctorBuilderExceptionParams.build());
		}
		if (ctorBuilderNoParams != null) {
			builder.addMethod(ctorBuilderNoParams.build());
		}
		// Methods
		if (copy != null) {
			String args = model.getFields().stream()
					.map(MemberModel::getName)
					.collect(Collectors.joining(", "));
			copy.addStatement("return new $L($L)", className, args);
			builder.addMethod(copy.build());
		}
		for (MethodModel method : model.getMethods()) {
			String methodRetType = method.getReturnType();
			String methodName = method.getName();
			// Build
			MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder(methodName)
					.returns(resolveFullType(packageName, methodRetType))
					.addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT);
			for (ParameterModel parameter : method.getParameters()) {
				String pType = parameter.getType();
				String pName = parameter.getName();
				ParameterSpec pSpec = ParameterSpec.builder(resolveFullType(packageName, pType), pName).build();
				methodBuilder.addParameter(pSpec);
			}
			// Add
			MethodSpec methodSpec = methodBuilder.build();
			builder.addMethod(methodSpec);
		}
		// Special methods
		if (classType == Type.DATA && !model.getFields().isEmpty()) {
			// Equality
			MethodSpec.Builder equals = MethodSpec.methodBuilder("equals");
			equals.addModifiers(Modifier.PUBLIC);
			equals.returns(boolean.class);
			equals.addParameter(Object.class, "o");
			equals.addAnnotation(Override.class);
			equals.addCode("if (this == o) return true;\n");
			equals.addCode("if (this == null || getClass() != o.getClass()) return false;\n");
			equals.addCode("$L that = ($L) o;\n", className, className);
			List<String> returnConditions = new ArrayList<>();
			for (FieldModel field : model.getFields()) {
				String fieldName = field.getName();
				TypeName fieldType = resolveFullType(packageName, field.getType());
				if (fieldType.isPrimitive()) {
					returnConditions.add(String.format("%s == that.%s", fieldName, fieldName));
				} else {
					returnConditions.add(String.format("java.util.Objects.equals(%s, that.%s)", fieldName, fieldName));
				}
			}
			equals.addCode("return " + String.join(" &&\n\t\t\t\t", returnConditions) + ";", className, className);
			// Hashcode
			MethodSpec.Builder hashCode = MethodSpec.methodBuilder("hashCode");
			hashCode.addModifiers(Modifier.PUBLIC);
			hashCode.returns(int.class);
			hashCode.addAnnotation(Override.class);
			hashCode.addCode("return java.util.Objects.hash(" +
					model.getFields().stream()
							.map(MemberModel::getName)
							.collect(Collectors.joining(", ")) +
					");");
			builder.addMethod(equals.build());
			builder.addMethod(hashCode.build());
		}
		// Build
		JavaFile javaFile = JavaFile.builder(packageName, builder.build()).build();
		return javaFile.toString();
	}

	/**
	 * @param type
	 * 		Name of type.
	 *
	 * @return Type instance.
	 */
	private TypeName resolve(String type) {
		type = mapAlias(type);
		if (primitiveMap.containsKey(type)) {
			return primitiveMap.get(type);
		}
		return ClassName.bestGuess(type);
	}

	/**
	 * @param currentPackage
	 * 		Context of what package the current class is defined in.
	 * 		Used to assist in resolving classes in the same package.
	 * @param type
	 * 		The type to resolve.
	 *
	 * @return Type instance.
	 */
	private TypeName resolveFullType(String currentPackage, String type) {
		for (ClassModel model : models) {
			if (type.equals(model.getName())) {
				String pkg = buildPackageName(model);
				if (!currentPackage.equals(pkg)) {
					type = pkg + "." + model.getName();
					break;
				}
			}
		}
		return resolve(type);
	}

	/**
	 * @param type
	 * 		Initial type name.
	 *
	 * @return Mapped type name applied from {@link #typeAlias the type alias map}.
	 */
	private String mapAlias(String type) {
		String aliased = typeAlias.get(type);
		if (!type.equals(aliased) && aliased != null) {
			return mapAlias(aliased);
		}
		return type;
	}

	/**
	 * @param model
	 * 		Model to get the package of.
	 *
	 * @return Package name of class.
	 */
	private static String buildPackageName(ClassModel model) {
		return model.getScope().stream()
				.filter(s -> s.getType() == ScopeType.PACKAGE)
				.map(Scope::getName)
				.collect(Collectors.joining("."));
	}

	/**
	 * @param name
	 * 		Name to camel case.
	 *
	 * @return Camel cased name.
	 */
	private static String camel(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}
}