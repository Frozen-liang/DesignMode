package com.ljd.principle.dependencyReverse.service.impl;

import com.ljd.principle.dependencyReverse.service.Cpu;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 13:59
 * @Version 1.0
 */
public class InterCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("计算机开始运行");
    }
}
