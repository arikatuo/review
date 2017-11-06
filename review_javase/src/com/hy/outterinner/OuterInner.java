package com.hy.outterinner;

/**
 * Created by sumimasah on 2017/9/5.
 */
public class OuterInner {
    public static void main(String[] str) {
        //Outer.Inner inner = Inner();
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        outer.show();
//        new Outer.Inner().fini();
//        System.out.println(inner.x);

        inner.fini();
    }
}

class Outer {
    int x = 3;

    void show() {
//        System.out.println("x = " + x);
//        new Inner().fini();
    }

    /**
     * 内部类
     *
     * @author LGL
     */
    class Inner {
        int x = 5;

        void fini() {
            int x = 6;
            System.out.println("内部类" + Outer.this.x);
            System.out.println("内部类" + x);
            System.out.println("内部类" + this.x);
        }
    }

//    static class Inner{
//        int x=5;
//         void fini(){
//            int x=6;
//            System.out.println("内部类"+x);
//        }
//    }
}
