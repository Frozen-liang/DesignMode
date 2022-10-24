package com.ljd.designmode.structure.proxy.dynamic.cglib;

/**
 * @Name ljd
 * @Description 真实主题
 * @date 2022/10/24 14:58
 * @Version 1.0
 */
public class RailwayStation {
    
    public void sell() {
        System.out.println("出票成功");
    }

    public void sorry(String disc) {
        System.out.println(disc);
    }

}
