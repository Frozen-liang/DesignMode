package com.ljd.designmode.creator.factory.abstractfactory.foodfactory;

import com.ljd.designmode.creator.factory.abstractfactory.food.Coffee;
import com.ljd.designmode.creator.factory.abstractfactory.food.Dessert;

/**
 * @Name ljd
 * @Description 食物工厂
 * @date 2022/10/18 14:14
 * @Version 1.0
 */
public interface LjdFoodFactory {

    // 咖啡
    Coffee creatCoffee(String type);

    // 奶茶
    Dessert creatDessert(String type);
}
