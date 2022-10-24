package com.ljd.designmode.creator.factory.abstractfactory.client;

import com.ljd.designmode.creator.factory.abstractfactory.food.Coffee;
import com.ljd.designmode.creator.factory.abstractfactory.food.Dessert;
import com.ljd.designmode.creator.factory.abstractfactory.foodfactory.impl.FoodForFactoryImpl;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/18 14:41
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        FoodForFactoryImpl food = new FoodForFactoryImpl();

        Coffee coffee = food.creatCoffee("1");
        Dessert dessert = food.creatDessert("1");

        System.out.println(coffee.getName());
        coffee.addMilk();

        System.out.println(dessert.refreshments());
    }
}
