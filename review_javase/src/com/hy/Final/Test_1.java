package com.hy.Final;

/**
 * Created by sumimasah on 2017/9/7.
 */
public class Test_1 {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
//        错误
//        myClass1.i=1;

        System.out.println(myClass1.i);
        System.out.println(myClass1.j);
        System.out.println(myClass2.i);
        System.out.println(myClass2.j);

        myClass1.j = 4;
        System.out.println(myClass1.j);

    }
}

class MyClass {
    public final double i = Math.random();
    public static double j = Math.random();

    //    public static double j = 1;
    static {
        System.out.println("add");
    }

}
