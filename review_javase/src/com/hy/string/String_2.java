package com.hy.string;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sumimasah on 2017/8/9.
 */
public class String_2 {
    String str = new String("good");
    String[] str2 = {"aaa", "b", "ssss"};
    char[] ch = new char[]{'a', 'b', 'c'};
    int[] in = {1, 2, 3, 4, 5};
    long[] lo = {1, 2, 3, 4, 5};

        @Override
    public String toString() {
        return Arrays.toString(ch);
    }
    public static void main(String[] args) {

        String_2 string_2 = new String_2();
//        System.out.println(string_2.ch);
//        System.out.println(string_2.in);
//        System.out.println(string_2.str);
//        System.out.println(string_2);
        // System.out.println(string_2.ch);
        // System.out.println(string_2.ch.toString());
        System.out.println("and  " + string_2.ch[0]);
        System.out.println(string_2.ch);
//        System.out.println(string_2.str2);
//        System.out.println(string_2.in);
        System.out.println(string_2.lo);
//        System.out.println(1);


        // string_2.change(string_2.str, string_2.ch);
        //  System.out.println(string_2.str + "   and   " + string_2.ch);


//        StringBuffer MyStrBuff1 = new StringBuffer();
//        MyStrBuff1.append("Hello, Guys!");
//        System.out.println(MyStrBuff1);
//        System.out.println(MyStrBuff1.toString());
//        MyStrBuff1.insert(6, 30);
//        System.out.println(MyStrBuff1.toString());

//        String MyStr = new StringBuffer().append("hello").toString();
//        MyStr = new StringBuffer().append(MyStr).append(" Guys!").toString();
//        System.out.println(MyStr);
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }
}
