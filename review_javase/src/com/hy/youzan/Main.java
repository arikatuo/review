package com.hy.youzan;

import java.util.Scanner;

/**
 * Created by sumimasah on 2017/9/21.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String a = method(str);
        System.out.println(a);
    }

    public static String method(String str) {
        String result = "";
        String[] strs = str.split(" ");

        int len = strs.length;
        for (int i = len - 1; i >= 0; i--) {
            result += strs[i] + " ";
        }
        return result;
    }
}