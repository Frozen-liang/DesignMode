package com.ljd.principle.dependencyReverse.service.impl;

import com.ljd.principle.dependencyReverse.service.HardDisk;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 13:56
 * @Version 1.0
 */
public class XiShuHardDisk implements HardDisk {
    @Override
    public void save(String data) {
        System.out.println("保存数据到西数硬盘");
    }

    @Override
    public String getHarDiskData() {
        return "西数硬盘";
    }
}
