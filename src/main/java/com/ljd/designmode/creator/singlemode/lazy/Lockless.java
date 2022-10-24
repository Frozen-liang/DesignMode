package com.ljd.designmode.creator.singlemode.lazy;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/19 09:35
 * @Version 1.0
 */
public class Lockless {
    private Lockless() {
    }

    private static Lockless delayForNos;

    public static Lockless getDelayForNos() {

        if (delayForNos == null) {
            delayForNos = new Lockless();
        }

        return delayForNos;
    }
}
