package ast;

public class VarDeclNode implements StmtNode {
    public final String name;
    public final String type;
    public final String initializer;

    public VarDeclNode(String type, String name, String initializer) {
        this.name = name;
        this.type = type;
        this.initializer = initializer;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
