package com.hy.string;

/**
 * Created by sumimasah on 2017/9/11.
 */
public class Test_4 {
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
        String c = b + 2;
        System.out.println((a == c));
    }
}
