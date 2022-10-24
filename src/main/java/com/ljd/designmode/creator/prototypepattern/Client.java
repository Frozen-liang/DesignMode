package com.ljd.designmode.creator.prototypepattern;

import com.ljd.designmode.creator.prototypepattern.prototype.Realize;
import com.ljd.designmode.creator.prototypepattern.shadowclone.Certificate;
import com.ljd.designmode.creator.prototypepattern.shadowclone.Student;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/19 13:53
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 原型对象
        Realize realize = new Realize();

        // 克隆原型对象
        Realize realize1 = realize.clone();

        System.out.println(realize == realize1);

        // demo 浅克隆 造成对象使用同一个地址 student == student1
        Student student = new Student();
        student.setName("梁杰栋");
        student.setAge(18);

        Certificate certificate = new Certificate();
        certificate.setStudent(student);

        Certificate clone = certificate.clone();
        Student student1 = clone.getStudent();
        student1.setName("李四");
        student1.setAge(28);
        clone.setStudent(student1);

        certificate.showName();
        certificate.showAge();
        clone.showName();
        clone.showAge();

        System.out.println(certificate == clone);
        // 问题所在
        System.out.println(student == student1);
    }
}
