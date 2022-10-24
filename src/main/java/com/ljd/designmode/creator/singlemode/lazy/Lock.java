package com.ljd.designmode.creator.singlemode.lazy;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/19 09:40
 * @Version 1.0
 */
public class Lock {

    private Lock() {
    }

    private static Lock lock;

    public synchronized static Lock getLock() {

        if (lock == null) {
            lock = new Lock();
        }
        return lock;

    }
}
