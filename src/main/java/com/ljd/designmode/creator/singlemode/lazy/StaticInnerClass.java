package com.ljd.designmode.creator.singlemode.lazy;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/19 09:47
 * @Version 1.0
 */
public class StaticInnerClass {
    private StaticInnerClass() {
    }

    private static class StaticInnerClassHolder {
        private static final StaticInnerClass staticInnerClass = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return StaticInnerClassHolder.staticInnerClass;
    }
}
