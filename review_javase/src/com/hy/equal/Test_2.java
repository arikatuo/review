package com.hy.equal;

/**
 * Created by sumimasah on 2017/9/6.
 */
public class Test_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String str = new String("hello");
//        String str1 = new String("hello");
//        String str2 = new String("hello");

        String str1 = str;
        String str2 = str;

        String str3 = "hello";
        String str4 = "hello";

        System.out.println(str3 == str4);

        System.out.println(str1.equals(str2));
    }
}
