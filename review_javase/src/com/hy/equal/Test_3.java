package com.hy.equal;

/**
 * Created by sumimasah on 2017/9/6.
 */
public class Test_3 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "he" + new String("llo");

        System.out.println(str1==str3);
        System.out.println(str2==str3);

        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }


}
