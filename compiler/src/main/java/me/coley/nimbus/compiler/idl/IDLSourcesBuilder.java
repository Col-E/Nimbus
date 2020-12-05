package me.coley.nimbus.compiler.idl;

import me.coley.nimbus.compiler.SourcesBuilder;
import me.coley.nimbus.compiler.Scope;
import me.coley.nimbus.compiler.idl.IDLParser.Enum_typeContext;
import me.coley.nimbus.compiler.idl.IDLParser.Except_declContext;
import me.coley.nimbus.compiler.idl.IDLParser.Interface_headerContext;
import me.coley.nimbus.compiler.idl.IDLParser.ModuleContext;
import me.coley.nimbus.compiler.idl.IDLParser.Struct_typeContext;
import me.coley.nimbus.compiler.model.ClassModel;
import me.coley.nimbus.compiler.model.ClassModel.Type;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

/**
 * Source generator for IDL inputs.
 *
 * @author Matt Coley
 */
public class IDLSourcesBuilder extends IDLBaseListener implements SourcesBuilder {
	private final Stack<Scope> scopeStack = new Stack<>();
	private final Stack<ClassModel> tempClassStack = new Stack<>();
	private final List<ClassModel> generatedClasses = new ArrayList<>();

	@Override
	public void enterStruct_type(Struct_typeContext ctx) {
		pushClassScope(Type.DATA, getTypeName(ctx));
	}

	@Override
	public void exitStruct_type(Struct_typeContext ctx) {
		generatedClasses.add(popBuild());
		popScope();
	}

	@Override
	public void enterInterface_header(Interface_headerContext ctx) {
		pushClassScope(Type.INTERFACE, getTypeName(ctx));
	}

	@Override
	public void exitInterface_header(Interface_headerContext ctx) {
		generatedClasses.add(popBuild());
		popScope();
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

	private static String getTypeName(ParserRuleContext ctx) {
		// 0 = keyword
		// 1 = name
		return ctx.children.get(1).getText();
	}
}