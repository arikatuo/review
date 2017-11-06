package com.hy.array;


import java.util.Arrays;

/**
 * Created by sumimasah on 2017/9/14.
 */
public class Test_1 {
    public static void main(String[] args) {
        char[] c1 = new char[]{'1', '2'};
        char[] c2 = new char[]{'1', 'f'};
        char[] c3 = new char[]{'s', '2'};
        char[] c4 = c3;
        c3[1] = 'g';
        System.out.println(c3);
        System.out.println(c4);
        String Sc3 = Arrays.toString(c3);

    }
}
