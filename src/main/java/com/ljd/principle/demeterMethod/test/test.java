package com.ljd.principle.demeterMethod.test;

import com.ljd.principle.demeterMethod.entity.Agent;
import com.ljd.principle.demeterMethod.entity.Company;
import com.ljd.principle.demeterMethod.entity.Fans;
import com.ljd.principle.demeterMethod.entity.Star;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 15:17
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Fans fans = new Fans("梁杰栋");
        Star star = new Star("马斯克");
        Company company = new Company("比亚迪");

        agent.setCompany(company);
        agent.setFans(fans);
        agent.setStar(star);
        agent.meet();
        agent.talk();
    }
}
