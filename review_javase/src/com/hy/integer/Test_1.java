package com.hy.integer;

/**
 * Created by sumimasah on 2017/9/7.
 */
public class Test_1 {
    public static void main(String[] args) {
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        Integer i5 = new Integer(-128);
        Integer i6 = new Integer(-128);
        System.out.println(i5 == i6);
        System.out.println(i5.equals(i6));
    }
}
