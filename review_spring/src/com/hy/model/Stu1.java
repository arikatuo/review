package com.hy.model;

/**
 * Created by dell on 2017/7/27.
 */
public class Stu1 implements Student {
        private String name;
        private String sex;
        private int age;

    public Stu1(String name, String sex, int age) {
            super();
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

    public void printInfo() {
        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
        System.out.println("性别:" + sex);
    }
}
