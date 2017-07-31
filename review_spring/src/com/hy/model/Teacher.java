package com.hy.model;

/**
 * Created by dell on 2017/7/31.
 */
public class Teacher {
    private int ID;
    private String name;
    private int age;
    private String sex;

    public Teacher() {
    }

    public Teacher(int ID, String name, int age, String sex) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
