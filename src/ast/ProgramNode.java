package ast;

import java.util.List;

public class ProgramNode implements ASTNode {
    public final List<ASTNode> declaration;

    public ProgramNode(List<ASTNode> declaration) {
        this.declaration = declaration;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
