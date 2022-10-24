package com.ljd.designmode.creator.build.phone;

/**
 * @Name ljd
 * @Description 构造者模式 随意搭配
 * @date 2022/10/24 14:18
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .name("ljd")
                .cpu("sanxin")
                .master("ljd")
                .build();
        System.out.println(phone);
    }
}
