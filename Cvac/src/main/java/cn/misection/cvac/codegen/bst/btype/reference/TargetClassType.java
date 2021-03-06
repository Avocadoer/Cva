package cn.misection.cvac.codegen.bst.btype.reference;

import cn.misection.cvac.codegen.bst.btype.basic.EnumTargetType;

/**
 * @author Military Intelligence 6 root
 * @version 1.0.0
 * @ClassName CvaClass
 * @Description TODO
 * @CreateTime 2021年02月14日 19:45:00
 */
public final class TargetClassType extends BaseReferenceType
{
    public static final String TYPE_LITERAL = "@class";

    private String literal;

    public TargetClassType(String literal)
    {
        this.literal = literal;
    }

    // FIXME
    // 后端这样行不行;
    @Override
    public String toString()
    {
        return String.format("@class:%s", literal);
    }

    @Override
    public EnumTargetType toEnum()
    {
        return EnumTargetType.TARGET_CLASS;
    }

    @Override
    public String literal()
    {
        return literal;
    }
}
