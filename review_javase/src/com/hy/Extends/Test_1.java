package com.hy.Extends;

/**
 * Created by sumimasah on 2017/9/6.
 */
public class Test_1 {
    public static void main(String[] args) {
        zi zi = new zi();
        System.out.println(zi.j);
    }
}

//父类要有午餐构造方法
class fu {
    int i = 0;

//    fu() {
//        System.out.println("fu1");
//    }

    public  fu(int k) {
        System.out.println("fu");
    }

    fu(int k, int j) {
        System.out.println("fu_2");
    }


}

class zi extends fu {

    public zi() {
        super(1, 1);
        int a = 0;
    }

    int j = 1;
}