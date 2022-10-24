package com.ljd.designmode.structure.proxy.dynamic.jdk;

import com.ljd.designmode.structure.proxy.dynamic.jdk.SellTicket;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/24 15:46
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTicket proxy = proxyFactory.getProxy();
//        proxy.sell();
        // 调用方法的时候菜会生成代理对象
        proxy.sorry("没有票了");
    }
}
