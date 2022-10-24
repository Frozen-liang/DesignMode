package com.ljd.designmode.creator.factory.abstractfactory.food.species;

import com.ljd.designmode.creator.factory.abstractfactory.food.Dessert;
import lombok.Data;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/18 14:32
 * @Version 1.0
 */
@Data
public class Tiramisu extends Dessert {

    @Override
    public String refreshments() {
        return "提拉米苏";
    }

}
