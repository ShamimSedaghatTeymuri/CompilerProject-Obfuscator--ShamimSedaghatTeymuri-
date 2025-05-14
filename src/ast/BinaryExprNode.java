package ast;

public class BinaryExprNode extends ExprNode {
    public final ExprNode left;
    public final ExprNode op;
    public final ExprNode right;


    public BinaryExprNode(ExprNode left, ExprNode op, ExprNode right) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
