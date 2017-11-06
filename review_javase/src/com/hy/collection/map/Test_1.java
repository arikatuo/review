package com.hy.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sumimasah on 2017/9/14.
 */
public class Test_1 {
    public static void main(String[] args) {
        Map<String, Person> hashMap = new HashMap<>();
        hashMap.put("张三", new Person("张三", 1));
        hashMap.put(null,null);
    }


}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
