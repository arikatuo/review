package com.hy.enum_test;

/**
 * Created by sumimasah on 2017/9/5.
 */
public enum EnumTest {
    MON, TUE, WED, THU, FRI, SAT, SUN;

   EnumTest() {

    }

    EnumTest(String s) {
        System.out.println("s");
    }
}
