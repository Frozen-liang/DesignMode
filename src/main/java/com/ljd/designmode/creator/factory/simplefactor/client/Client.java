package com.ljd.designmode.creator.factory.simplefactor.client;

import com.ljd.designmode.creator.factory.simplefactor.food.Coffee;
import com.ljd.designmode.creator.factory.simplefactor.foodfactory.CoffeeFactory;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/18 14:41
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        Coffee coffee = CoffeeFactory.creatCoffee("CoffeeLatte");
        System.out.println(coffee.getName());
    }
}
