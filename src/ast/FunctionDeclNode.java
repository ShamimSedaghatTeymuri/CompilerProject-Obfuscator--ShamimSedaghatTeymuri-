package ast;

import java.util.List;

public class FunctionDeclNode implements ASTNode {
    public final String returnType;
    public final String name;
    public final List<ParamNode> params;
    public final BlockNode block;

    public FunctionDeclNode(String returnType, String name, List<ParamNode> params, BlockNode block) {
        this.returnType = returnType;
        this.name = name;
        this.params = params;
        this.block = block;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
