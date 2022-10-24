package com.ljd.principle.dependencyReverse.test;

import com.ljd.principle.dependencyReverse.entity.Computer;
import com.ljd.principle.dependencyReverse.service.impl.InterCpu;
import com.ljd.principle.dependencyReverse.service.impl.JingShiDunMemory;
import com.ljd.principle.dependencyReverse.service.impl.XiShuHardDisk;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 14:05
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Computer computer = new Computer();

        InterCpu interCpu = new InterCpu();
        JingShiDunMemory jingShiDunMemory = new JingShiDunMemory();
        XiShuHardDisk xiShuHardDisk = new XiShuHardDisk();

        computer.setCpu(interCpu);
        computer.setMemory(jingShiDunMemory);
        computer.setHardDisk(xiShuHardDisk);

        computer.run("梁杰栋计算机");
    }
}
