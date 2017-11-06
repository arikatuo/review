package com.hy.string;

/**
 * Created by sumimasah on 2017/9/11.
 */
public class Test_2 {
    static int time = 50000;

    public static void main(String[] args) {
        testString();
        optimalString();
    }


    public static void testString() {
        String s = "";
        long begin = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            s += "java";
        }
        long end = System.currentTimeMillis();

        System.out.println("String" + (end - begin )+ "毫秒");
    }

    public static void optimalString() {
        String s = "";
        long begin = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.append("java");
            s=sb.toString();
        }
        long end = System.currentTimeMillis();

        System.out.println("optimalString" + (end - begin) + "毫秒");
    }
}

