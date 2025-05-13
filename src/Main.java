import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.MiniCLexer;
import parser.MiniCParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try {

            String inputFile = "input.mc";
            String code = Files.readString(Path.of("input.mc"));

            CharStream input = CharStreams.fromString(code);
            MiniCLexer lexer = new MiniCLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniCParser parser = new MiniCParser(tokens);

            ParseTree tree = parser.program();

            System.out.println("Parse Tree:");
            System.out.println(tree.toStringTree(parser));
        } catch (IOException e) {
            System.out.println("Error reading input.mc: " + e.getMessage());
        }
    }
}
