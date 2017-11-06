package com.hy.Static;

/**
 * Created by sumimasah on 2017/9/17.
 */
public class Test_2 {
    public int a=1;
    public static int b=2;

    public static void main(String[] args) {
        Test_2 test_2=new Test_2();
        test_2.print1();

        Test_2.print2();
    }

    public void print1(){
        System.out.println("print1");
    }

    public static void print2(){
        System.out.println("print2");
    }
}
