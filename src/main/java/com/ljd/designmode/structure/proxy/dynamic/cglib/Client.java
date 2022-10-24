package com.ljd.designmode.structure.proxy.dynamic.cglib;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/24 16:34
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        RailwayStation proxy = proxyFactory.getProxy();
        proxy.sell();
    }
}
