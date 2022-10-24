package com.ljd.designmode.creator.prototypepattern.prototype;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/19 13:52
 * @Version 1.0
 */
public class Realize implements Cloneable{
    @Override
    public Realize clone() throws CloneNotSupportedException {
        return (Realize)super.clone();
    }
}
