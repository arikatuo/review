package com.ly.test;

import com.hy.java.MyArray;

/**
 * Created by dell on 2017/7/25.
 */
public class Test_MyArray {
    public static void main(String[] args) {
        MyArray m=new MyArray(50);
        m.insert(10);
        m.insert(20);
        m.insert(50);
        m.insert(30);
        m.insert(19);
        m.display();
        m.delete(2);
        m.display();
    }
}
