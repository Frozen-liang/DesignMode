package com.ljd.designmode.creator.factory.abstractfactory.foodfactory.impl;

import com.ljd.designmode.creator.factory.abstractfactory.food.Coffee;
import com.ljd.designmode.creator.factory.abstractfactory.food.Dessert;
import com.ljd.designmode.creator.factory.abstractfactory.food.species.CoffeeLatte;
import com.ljd.designmode.creator.factory.abstractfactory.food.species.MatChaCake;
import com.ljd.designmode.creator.factory.abstractfactory.food.species.Tiramisu;
import com.ljd.designmode.creator.factory.abstractfactory.food.species.AmericanoCafe;
import com.ljd.designmode.creator.factory.abstractfactory.foodfactory.LjdFoodFactory;

import javax.annotation.Resource;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/18 14:36
 * @Version 1.0
 */
public class FoodForFactoryImpl implements LjdFoodFactory {
    @Resource
    private Coffee coffee;
    @Resource
    private Dessert dessert;

    @Override
    public Coffee creatCoffee(String type) {

        switch (Integer.parseInt(type)) {
            case 1:
                coffee = new AmericanoCafe();
                break;
            case 2:
                coffee = new CoffeeLatte();
                break;
        }
        return coffee;
    }

    @Override
    public Dessert creatDessert(String type) {

        switch (Integer.parseInt(type)) {
            case 1:
                dessert = new Tiramisu();
                break;
            case 2:
                dessert = new MatChaCake();
                break;
        }
        return dessert;
    }
}
