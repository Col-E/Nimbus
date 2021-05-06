package me.coley.nimbus.compiler;

import me.coley.nimbus.compiler.parse.idl.IDLSourcesBuilder;
import me.coley.nimbus.compiler.parse.idl.IDLLexer;
import me.coley.nimbus.compiler.parse.idl.IDLParser;
import me.coley.nimbus.compiler.model.ClassModel;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class IdlCompilerTests {
	private static final int NUM_CLASSES = 6;

	@Test
	public void testAddressBook() {
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
			Collection<ClassModel> models = builder.getModels();
			// for (ClassModel model : models) {
			// 	System.out.println(new ClassEmitter().emit(model));
			// 	System.out.println("\n\n");
			// }
			assertEquals(NUM_CLASSES, models.size());
		}catch (Exception ex) {
			fail(ex);
		}
	}
}