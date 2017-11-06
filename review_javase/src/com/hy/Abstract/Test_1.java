package com.hy.Abstract;

/**
 * Created by sumimasah on 2017/9/17.
 */
public class Test_1 extends Abstrat_1 {
    @Override
    void add_2() {
        System.out.println("lll");
    }




    public static void main(String[] args) {
        Abstrat_1 abstrat_1=new Test_1();
        abstrat_1.add_2();
    }
}
