package com.ljd.designmode.creator.singlemode.hunger;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/19 09:28
 * @Version 1.0
 */
public class StaticBlock {

    private StaticBlock() {
    }

    private static final StaticBlock staticBlock;

    static {
        staticBlock = new StaticBlock();
    }

    public static StaticBlock getStaticBlock(){
        return staticBlock;
    }
}
