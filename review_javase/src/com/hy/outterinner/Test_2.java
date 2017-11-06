package com.hy.outterinner;

/**
 * Created by sumimasah on 2017/9/6.
 */
public class Test_2 {
    public static void main(String[] args) {
//        Outer_3.Inner_2 inner_2 = new Outer_3().new Inner_2();
//        inner_2.show();

        new Outer_3().function();
    }
}

class Outer_3 {
    //    class Inner_2 extends Adsdemo {
//
//        @Override
//        void show() {
//            System.out.println("inner");
//        }
//    }
    public void function() {

        new Adsdemo() {
            @Override
            void show () {
                System.out.println("inner");

            }
        };

    }
}
abstract class Adsdemo {
    abstract void show();
}