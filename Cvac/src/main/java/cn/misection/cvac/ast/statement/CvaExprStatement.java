package cn.misection.cvac.ast.statement;

import cn.misection.cvac.ast.expr.AbstractExpression;

/**
 * @author Military Intelligence 6 root
 * @version 1.0.0
 * @ClassName CvaExprStatement
 * @Description TODO
 * @CreateTime 2021年02月23日 12:19:00
 */
public class CvaExprStatement extends AbstractStatement
{
    private AbstractExpression expr;

    public CvaExprStatement(int lineNum,
                            AbstractExpression expr)
    {
        super(lineNum);
        this.expr = expr;
    }

    @Override
    public EnumCvaStatement toEnum()
    {
        return EnumCvaStatement.EXPR_STATEMENT;
    }
}
