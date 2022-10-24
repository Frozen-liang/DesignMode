package com.ljd.principle.interfaceIsolation.service.impl;

import com.ljd.principle.interfaceIsolation.service.FireProtectionDoor;
import com.ljd.principle.interfaceIsolation.service.SafeDoor;
import com.ljd.principle.interfaceIsolation.service.WaterProofDoor;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 14:57
 * @Version 1.0
 */
public class LjdDoor implements FireProtectionDoor, SafeDoor, WaterProofDoor {
    @Override
    public void FireProtect() {
        System.out.println("防火");
    }

    @Override
    public void Safe() {
        System.out.println("安全门");
    }

    @Override
    public void WaterProof() {
        System.out.println("防水");
    }
}
