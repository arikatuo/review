package com.hy.outterinner;

/**
 * Created by sumimasah on 2017/9/6.
 */
public class Test_1 {
    // 公共的 静态 无返回值 main方法 数组
    public static void main(String[] str) {
        new Outer_2().fini();
    }
}

class Outer_2 {

    int x = 3;

    void fini() {

        class fini {

            void show() {

                System.out.println("内部类");
            }
        }
        new fini().show();
    }
}