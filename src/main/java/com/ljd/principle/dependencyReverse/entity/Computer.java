package com.ljd.principle.dependencyReverse.entity;

import com.ljd.principle.dependencyReverse.service.Cpu;
import com.ljd.principle.dependencyReverse.service.HardDisk;
import com.ljd.principle.dependencyReverse.service.Memory;
import lombok.Data;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 14:00
 * @Version 1.0
 */
@Data
public class Computer {
    private Cpu cpu;
    private HardDisk hardDisk;
    private Memory memory;

    public void run(String data) {
        System.out.println("运行计算机");

        hardDisk.save(data);
        System.out.println(hardDisk.getHarDiskData());
        memory.save(data);
        cpu.run();
    }
}
