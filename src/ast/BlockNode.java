package ast;

import java.util.List;

public class BlockNode implements ASTNode {
    public final List<ASTNode> statement;

    public BlockNode(List<ASTNode> statement) {
        this.statement = statement;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
