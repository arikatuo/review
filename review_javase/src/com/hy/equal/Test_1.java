package com.hy.equal;

/**
 * Created by sumimasah on 2017/9/6.
 */
public class Test_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 3;
        int m = 3;

        System.out.println(n == m);

        String str = new String("hello");
        String str1 = new String("hello");
        String str2 = new String("hello");
        String str3 = new String("hello");

        System.out.println(str1 == str2);

        str1 = str;
        str2 = str;
        boolean flag=false;
        if(str1==str2)
        {
            flag=true;
        }

        System.out.println(flag);
    }
}
