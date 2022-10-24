package com.ljd.designmode.creator.factory.abstractfactory.food;

import lombok.Data;

/**
 * @Name ljd
 * @Description
 * @date 2022/10/18 14:15
 * @Version 1.0
 */
public abstract class Coffee {

    public abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }

}
