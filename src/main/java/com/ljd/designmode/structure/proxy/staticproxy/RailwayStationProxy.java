package com.ljd.designmode.structure.proxy.staticproxy;

/**
 * @Name ljd
 * @Description 真实主题的代理商
 * @date 2022/10/24 14:58
 * @Version 1.0
 */
public class RailwayStationProxy implements SellTicket {

    // 静态代理
    private final RailwayStation railwayStation = new RailwayStation();

    @Override
    public void sell() {
        // 代理之前的操作
        System.out.println("经过代理收取费用");
        railwayStation.sell();
    }
}
