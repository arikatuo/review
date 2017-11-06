package com.hy.Static;

/**
 * Created by sumimasah on 2017/9/10.
 */
public class Test_1 {
    static int value = 33;
    public  int i=0;

    public static void main(String[] args) throws Exception {
        new Test_1().printValue();

        new Test_1().get();



    }

    private void printValue() {
        int value = 3;
        System.out.println(this.value);
        System.out.println(value);
        System.out.println(A.a);

        A a=new A();

        System.out.println(a.a);

        B b=new B();

        System.out.println(b.b);


    }


    public  void  get(){
        System.out.println("1");
    }
}

class A {
   public static int a = 8;
}

class B{
    public int b=9;


}
