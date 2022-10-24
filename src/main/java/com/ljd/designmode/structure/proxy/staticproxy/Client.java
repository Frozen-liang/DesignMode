package com.ljd.designmode.structure.proxy.staticproxy;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/24 15:03
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        RailwayStationProxy railwayStationProxy = new RailwayStationProxy();
        railwayStationProxy.sell();
    }
}
