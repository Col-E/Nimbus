package me.coley.nimbus.compiler.parse.idl;

import me.coley.nimbus.compiler.SourcesBuilder;
import me.coley.nimbus.compiler.Scope;
import me.coley.nimbus.compiler.parse.idl.IDLParser.DeclaratorContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.DeclaratorsContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Enum_typeContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.EnumeratorContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Except_declContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.IdentifierContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Interface_declContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Interface_headerContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Interface_inheritance_specContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.MemberContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.ModuleContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Op_declContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Op_type_specContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Param_declContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Raises_exprContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Scoped_nameContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Struct_typeContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Type_declContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Type_declaratorContext;
import me.coley.nimbus.compiler.parse.idl.IDLParser.Type_specContext;
import me.coley.nimbus.compiler.model.ClassModel;
import me.coley.nimbus.compiler.model.ClassModel.Type;
import me.coley.nimbus.compiler.model.FieldModel;
import me.coley.nimbus.compiler.model.MemberModel;
import me.coley.nimbus.compiler.model.MethodModel;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Source generator for IDL inputs.
 *
 * @author Matt Coley
 */
public class IDLSourcesBuilder extends IDLBaseListener implements SourcesBuilder {
	// TODO: Change to the following
	//  1. Intercept root, find type aliases and record into map
	//  2. Intercept class definitions
	//     - Scan for declared members (visitor pattern in this flat structure is confusing)
	private final Stack<Scope> scopeStack = new Stack<>();
	private final Stack<ClassModel> tempClassStack = new Stack<>();
	private final List<ClassModel> generatedClasses = new ArrayList<>();
	private final Map<String, String> typeAliases = new HashMap<>();
	private MemberModel tempMember;

	// ============================================================================ //
	// =========================== SCOPE AND CLASSES ============================== //
	// ============================================================================ //

	@Override
	public void enterStruct_type(Struct_typeContext ctx) {
		pushClassScope(Type.DATA, getTypeName(ctx));
		// Structs can only have a single parent, so the g4 doesn't give it a special case handler like interfaces
		Scoped_nameContext superType = ctx.getChild(Scoped_nameContext.class, 0);
		if (superType != null) {
			getBuildStack().peek().getInterfaces().add(superType.getText());
		}
	}

	@Override
	public void exitStruct_type(Struct_typeContext ctx) {
		generatedClasses.add(popBuild());
		popScope();
	}

	@Override
	public void enterInterface_decl(Interface_declContext ctx) {
		Interface_headerContext header = ctx.getChild(Interface_headerContext.class, 0);
		pushClassScope(Type.INTERFACE, getTypeName(header));
	}

	@Override
	public void exitInterface_decl(Interface_declContext ctx) {
		generatedClasses.add(popBuild());
		popScope();
	}

	@Override
	public void enterInterface_inheritance_spec(Interface_inheritance_specContext ctx) {
		getBuildStack().peek().getInterfaces().add(getTypeName(ctx));
	}

	@Override
	public void enterEnum_type(Enum_typeContext ctx) {
		pushClassScope(Type.ENUM, getTypeName(ctx));
	}

	@Override
	public void exitEnum_type(Enum_typeContext ctx) {
		generatedClasses.add(popBuild());
		popScope();
	}

	@Override
	public void enterExcept_decl(Except_declContext ctx) {
		pushClassScope(Type.EXCEPTION, getTypeName(ctx));
	}

	@Override
	public void exitExcept_decl(Except_declContext ctx) {
		generatedClasses.add(popBuild());
		popScope();
	}

	@Override
	public void enterModule(ModuleContext ctx) {
		pushPackageScope(getTypeName(ctx));
	}

	@Override
	public void exitModule(ModuleContext ctx) {
		popScope();
	}

	// ============================================================================ //
	// ============================= CLASS FILLING ================================ //
	// ============================================================================ //

	@Override
	public void enterMember(MemberContext ctx) {
		// Fields
		handleMember(ctx);
	}

	@Override
	public void exitMember(MemberContext ctx) {
		handlePopMember();
	}

	@Override
	public void enterEnumerator(EnumeratorContext ctx) {
		String name = ctx.getText();
		String type = tempClassStack.peek().getName();
		getBuildStack().peek().getFields().add(new FieldModel(name, type));
	}

	@Override
	public void enterOp_decl(Op_declContext ctx) {
		// Methods
		handleMember(ctx);
	}

	@Override
	public void exitOp_decl(Op_declContext ctx) {
		handlePopMember();
	}
	
	@Override
	public void enterParam_decl(Param_declContext ctx) {
		validateMethod();
		// Add parameter
		String type = ctx.getChild(ctx.getChildCount() - 3).getText();
		String name = ctx.getChild(ctx.getChildCount() - 1).getText();
		((MethodModel) tempMember).addParameter(name, type);
	}



	@Override
	public void enterRaises_expr(Raises_exprContext ctx) {
		validateMethod();
		// Add exception
		String type = ctx.getChild(1).getText();
		((MethodModel) tempMember).addException(type);
	}

	// ============================================================================ //
	// ============================== TYPE ALIASES ================================ //
	// ============================================================================ //

	@Override
	public void enterType_declarator(Type_declaratorContext ctx) {
		String original = ctx.getChild(0).getText();
		String alias = ctx.getChild(1).getText();
		typeAliases.put(alias, original);
	}

	// ============================================================================ //
	// ================================ GETTERS =================================== //
	// ============================================================================ //

	@Override
	public Stack<Scope> getScope() {
		return scopeStack;
	}

	@Override
	public Stack<ClassModel> getBuildStack() {
		return tempClassStack;
	}

	@Override
	public Collection<ClassModel> getModels() {
		return generatedClasses;
	}

	/**
	 * @return Map of aliases to their original types. Names of types are as they appear in the IDL file.
	 */
	public Map<String, String> getTypeAliases() {
		return typeAliases;
	}

	// ============================================================================ //
	// =============================== UTILITIES ================================== //
	// ============================================================================ //

	private void handleMember(ParserRuleContext ctx) {
		if (ctx.getText().contains("(")) {
			// Methods
			String name = ctx.getChild(IdentifierContext.class, 0).getText();
			String type = ctx.getChild(Op_type_specContext.class, 0).getText();
			tempMember = new MethodModel(name, type);
		} else {
			// Fields
			String name = ctx.getChild(DeclaratorsContext.class, 0).getChild(DeclaratorContext.class, 0).getText();
			String type = ctx.getChild(Type_specContext.class, 0).getText();
			tempMember = new FieldModel(name, type);
		}
	}

	private void validateMethod() {
		if (tempMember == null) {
			throw new IllegalStateException("Found parameter declaration, but context was not found!");
		} else if (!(tempMember instanceof MethodModel)) {
			throw new IllegalStateException("Found parameter declaration, but context was not a method!");
		}
	}

	private void handlePopMember() {
		if (tempMember instanceof FieldModel) {
			getBuildStack().peek().getFields().add((FieldModel) tempMember);
		} else {
			getBuildStack().peek().getMethods().add((MethodModel) tempMember);
		}
		tempMember = null;
	}

	private static String getTypeName(ParserRuleContext ctx) {
		// 0 = keyword
		// 1 = name
		return ctx.getChild(1).getText();
	}
}