package com.hy.Final;

/**
 * Created by sumimasah on 2017/9/7.
 */
public class Test_2 {
    public static void main(String[] args) {
        f_1 f_1_1 = new f_1();

//        f_1_1.i=1;
        f_1_1 = new f_1();

//        System.out.println(f_1_1==f_1_2);


    }
}

final class f_1 {
    public final f_2 f_2 = new f_2();

}

final class f_2 {
    public static final int i ;
    static {
        i=0;
    }
}
