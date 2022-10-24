package com.ljd.designmode.creator.prototypepattern.shadowclone;

import lombok.Data;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/19 13:58
 * @Version 1.0
 */
@Data
public class Certificate implements Cloneable {

    //    private String name;
//    private Integer age;
    private Student student;

    public void showName() {
        System.out.println(student.getName() + "获得了奖状");
    }

    public void showAge() {
        System.out.println(student.getName() + "岁数为" + student.getAge());
    }

    @Override
    public Certificate clone() throws CloneNotSupportedException {
        return (Certificate) super.clone();
    }
}
