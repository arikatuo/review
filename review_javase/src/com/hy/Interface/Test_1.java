package com.hy.Interface;

/**
 * Created by sumimasah on 2017/9/17.
 */
public class Test_1 implements Inter_1 {
    @Override
    public void add_1() {
        System.out.println("1");
    }

    @Override
    public void add_2() {
        System.out.println(1);
    }

    Inter_1 inter_1 = new Test_1();


    public static void main(String[] args) {

        Inter_1 inter_1 = new Test_1();
        inter_1.add_1();
        int g = Inter_1.i;

        int f = inter_1.i;
    }
}
