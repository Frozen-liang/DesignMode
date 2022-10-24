package com.ljd.designmode.creator.singlemode.test;

import com.ljd.designmode.creator.singlemode.lazy.Hunger;
import com.ljd.designmode.creator.singlemode.hunger.StaticBlock;
import com.ljd.designmode.creator.singlemode.hunger.StaticMember;
import com.ljd.designmode.creator.singlemode.lazy.Lockless;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/19 09:24
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 饿汉模式 静态成员变量
        StaticMember staticMember = StaticMember.getStaticMember();
        StaticMember staticMember1 = StaticMember.getStaticMember();
        System.out.println(staticMember == staticMember1);

        // 静态代码块
        StaticBlock staticBlock = StaticBlock.getStaticBlock();
        StaticBlock staticBlock1 = StaticBlock.getStaticBlock();
        System.out.println(staticBlock == staticBlock1);

        // 懒汉模式 无锁
        Lockless lockless = Lockless.getDelayForNos();
        Lockless lockless1 = Lockless.getDelayForNos();
        System.out.println(lockless == lockless1);

        // 有锁

        // 枚举模式
        Hunger instance = Hunger.INSTANCE;
        Hunger instance1 = Hunger.INSTANCE;
        System.out.println(instance == instance1);

        // 双重检查锁

        // 静态内部类

    }
}
