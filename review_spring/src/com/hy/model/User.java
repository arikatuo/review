package com.hy.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by sumimasah on 2017/7/31.
 */
@Repository
@Scope("prototype")
//@Repository用于标注数据访问组件，即DAO组件
//@Scope("prototype")让其每次返回不同的实例，默认是单例
public class User {
    private String name;
    private String sex;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private int age;
}
