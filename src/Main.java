import ast.ASTBuilderVisitor;
import ast.ObfuscatorVisitor;
import ast.ProgramNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.MiniCLexer;
import parser.MiniCParser;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            try {
                String inputFile = "input" + i + ".mc";
                String outputFile = "output" + i + ".mc";
                String code = new String(Files.readAllBytes(Paths.get(inputFile)));
                //parse tree
                CharStream input = CharStreams.fromString(code);
                MiniCLexer lexer = new MiniCLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                MiniCParser parser = new MiniCParser(tokens);
                ParseTree tree = parser.program();
                //AST from parse tree
                ASTBuilderVisitor astBuilder = new ASTBuilderVisitor();
                ProgramNode ast = (ProgramNode) astBuilder.visit(tree);
                if (ast == null) {
                    System.out.println("AST is null for " + inputFile);
                    return;
                }
                //obfuscation
                ObfuscatorVisitor obfuscator = new ObfuscatorVisitor();
                String obfuscated = ast.accept(obfuscator);

                try (PrintWriter out = new PrintWriter(outputFile)) {
                    out.println(obfuscated);
                }
                System.out.println("obfuscation complete for " + inputFile);
            } catch (IOException e) {
                System.out.println("Error reading input" + i + ".mc" + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error in input" + i + ".mc" + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
