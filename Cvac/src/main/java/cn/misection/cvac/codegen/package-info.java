/**
 * @ClassName package-info
 * @author Military Intelligence 6 root
 * @version 1.0.0
 * @Description TODO
 * @CreateTime 2021年02月16日 12:00:00
 */
package cn.misection.cvac.codegen;


import cn.misection.cvac.ast.type.basic.EnumCvaType;
import cn.misection.cvac.codegen.bst.btype.advance.TargetStringType;
import cn.misection.cvac.constant.WriteOptionCode;

import java.util.HashMap;

final class StackConst
{
    /**
     * 最大栈深度;
     */
    public static final int MAX_STACK_DEPTH = 4096;

    /**
     * 禁止构造;
     */
    private StackConst() {}
}

final class WriteModeMap extends HashMap<Byte, String>
{
    private static WriteModeMap instance = null;

    private WriteModeMap()
    {
        init();
    }

    public static WriteModeMap getInstance()
    {
        if (instance == null)
        {
            synchronized (WriteModeMap.class)
            {
                if (instance == null)
                {
                    instance = new WriteModeMap();
                }
            }
        }
        return instance;
    }

    private void init()
    {
        this.put(WriteOptionCode.CONSOLE_WRITE, "print");
        this.put(WriteOptionCode.CONSOLE_WRITELN, "println");
        this.put(WriteOptionCode.CONSOLE_WRITE_FORMAT, "printf");
    }
}


final class WriteTypeMap extends HashMap<EnumCvaType, String>
{
    private static WriteTypeMap instance = null;

    private WriteTypeMap()
    {
        init();
    }

    public static WriteTypeMap getInstance()
    {
        if (instance == null)
        {
            synchronized (WriteTypeMap.class)
            {
                if (instance == null)
                {
                    instance = new WriteTypeMap();
                }
            }
        }
        return instance;
    }

    private void init()
    {
        this.put(EnumCvaType.INT, "I");
        this.put(EnumCvaType.STRING, String.format("L%s;", TargetStringType.FULL_LITERAL));
    }
}