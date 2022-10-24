package com.ljd.principle.dependencyReverse.service.impl;

import com.ljd.principle.dependencyReverse.service.Memory;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 13:58
 * @Version 1.0
 */
public class JingShiDunMemory implements Memory {

    @Override
    public void save(String data) {
        System.out.println("存入数据到内存");
    }
}
