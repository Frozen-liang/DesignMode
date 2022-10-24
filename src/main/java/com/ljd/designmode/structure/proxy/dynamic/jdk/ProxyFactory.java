package com.ljd.designmode.structure.proxy.dynamic.jdk;

import com.ljd.designmode.structure.proxy.dynamic.jdk.SellTicket;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/24 15:35
 * @Version 1.0
 */
public class ProxyFactory {
    // 目标对象
    private RailwayStation railwayStation = new RailwayStation();

    // 创建代理对象
    public SellTicket getProxy() {
        /*
                ClassLoader loader,  目标对象的类加载器
                Class<?>[] interfaces, 目标对象的实现接口的对象
                InvocationHandler h     代理对象的调用程序
         */
        /*
            proxy, 代理对象 基本不用
            method, 对接口中的方法封装
            args 接口方法中的参数
         */
        SellTicket proxyInstance = (SellTicket) Proxy.newProxyInstance(
                railwayStation.getClass().getClassLoader(),
                railwayStation.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    // 代理增强
                    System.out.println("jdk代理收取费用");
                    // 目标对象方法使用 obj 为返回值 ？？？？
                    Object obj = method.invoke(railwayStation, args);
                    return obj;
                }
        );

        return proxyInstance;
    }
}
