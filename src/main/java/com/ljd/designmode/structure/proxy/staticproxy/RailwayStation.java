package com.ljd.designmode.structure.proxy.staticproxy;

/**
 * @Name ljd
 * @Description 真实主题
 * @date 2022/10/24 14:58
 * @Version 1.0
 */
public class RailwayStation implements SellTicket{
    @Override
    public void sell() {
        System.out.println("出票成功");
    }
}
