package com.ly.test;

import com.hy.java.MyArray;
import com.hy.java.MyOrderArray;

/**
 * Created by dell on 2017/7/25.
 */
public class Test_MyOrderArray {
    public static void main(String[] args) {
        MyOrderArray m = new MyOrderArray(50);

        m.orderinsert(33);
        m.orderinsert(53);
        m.orderinsert(13);
        m.orderinsert(73);
        m.orderinsert(23);

        m.display();

        int index = m.binaySearch(43);
        System.out.println(index);
    }
}
