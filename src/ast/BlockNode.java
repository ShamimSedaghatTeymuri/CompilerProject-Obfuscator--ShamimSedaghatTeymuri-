package ast;

import java.util.List;

public class BlockNode implements ASTNode {
    public final List<StmtNode> statement;

    public BlockNode(List<StmtNode> statement) {
        this.statement = statement;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
