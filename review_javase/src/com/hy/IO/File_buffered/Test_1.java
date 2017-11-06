package com.hy.IO.File_buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        char a;

        System.out.println("输入");

        str = br.readLine();
        a = (char)br.read();
        System.out.println("输出：" + str);
        System.out.println("输出：" + Integer.toString(a));
        System.out.println("输出：" + a);
    }
}
