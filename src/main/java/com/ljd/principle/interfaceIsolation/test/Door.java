package com.ljd.principle.interfaceIsolation.test;

import com.ljd.principle.interfaceIsolation.service.impl.LjdDoor;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 15:00
 * @Version 1.0
 */
public class Door {
    public static void main(String[] args) {
        LjdDoor ljdDoor = new LjdDoor();
        ljdDoor.FireProtect();
        ljdDoor.WaterProof();
        ljdDoor.Safe();
    }
}
