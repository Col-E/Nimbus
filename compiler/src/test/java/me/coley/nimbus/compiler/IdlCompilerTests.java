package me.coley.nimbus.compiler;

import me.coley.nimbus.compiler.model.ClassModel;
import me.coley.nimbus.compiler.parse.idl.IDLLexer;
import me.coley.nimbus.compiler.parse.idl.IDLParser;
import me.coley.nimbus.compiler.parse.idl.IDLSourcesBuilder;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class IdlCompilerTests {
	private static final int NUM_CLASSES = 6;
	private static Collection<ClassModel> models;
	private static ClassEmitter emitter;

	@BeforeAll
	public static void setup() {
		try {
			CharStream stream = CharStreams.fromStream(IdlCompilerTests.class.getResourceAsStream("/AddressBook.idl"));
			IDLLexer lexer = new IDLLexer(stream);
			//
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			IDLParser parser = new IDLParser(tokens);
			IDLSourcesBuilder builder = new IDLSourcesBuilder();
			ParseTreeWalker walker = new ParseTreeWalker();
			ParseTree tree = parser.module();
			walker.walk(builder, tree);
			//
			models = builder.getModels();
			assertEquals(NUM_CLASSES, models.size());
			//
			Map<String, String> aliases = builder.getTypeAliases();
			emitter = new ClassEmitter(models, aliases);
		} catch (Exception ex) {
			fail(ex);
		}
	}

	@ParameterizedTest
	@MethodSource("getModels")
	public void testAddressBook(ClassModel model) {
		String code = emitter.emit(model);
		assertNotNull(code, "Could not emit code for class: " + model.getName());
		System.out.println(code);
	}

	public static Stream<ClassModel> getModels() {
		return models.stream();
	}
}
