package com.ljd.designmode.creator.singlemode.lazy;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/19 09:42
 * @Version 1.0
 */
public class DoubleCheckedLock {

    private DoubleCheckedLock() {
    }

    private static DoubleCheckedLock doubleCheckedLock;

    public static DoubleCheckedLock getDoubleCheckedLock() {

        if (doubleCheckedLock == null) {
            synchronized (DoubleCheckedLock.class) {
                if (doubleCheckedLock == null) {
                    doubleCheckedLock = new DoubleCheckedLock();
                }
            }
        }

        return doubleCheckedLock;
    }
}
