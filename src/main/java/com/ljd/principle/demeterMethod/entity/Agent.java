package com.ljd.principle.demeterMethod.entity;

import lombok.Data;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 15:13
 * @Version 1.0
 */
@Data
public class Agent {
    private Company company;
    private Fans fans;
    private Star star;

    // 粉丝和明星见面
    public void meet() {
        System.out.println(fans.getName() + "meet" + star.getName());
    }

    // 明星和公司洽谈
    public void talk() {
        System.out.println(star.getName() + "talk" + company.getName());
    }
}
