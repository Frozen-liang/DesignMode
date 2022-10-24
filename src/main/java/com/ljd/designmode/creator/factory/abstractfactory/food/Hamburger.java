package com.ljd.designmode.creator.factory.abstractfactory.food;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/18 14:59
 * @Version 1.0
 */
public abstract class Hamburger {

    public abstract String getName();

    public void addMeet(){
        System.out.println("加肉");
    }
}
