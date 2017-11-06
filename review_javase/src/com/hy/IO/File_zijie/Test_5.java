package com.hy.IO.File_zijie;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_5 {
    public static void main(String[] args) throws IOException {
        String name = "d:" + File.separator + "a.txt";
        File file = new File(name);
        InputStream is = new FileInputStream(file);
        long len = file.length();

        byte[] bytes = new byte[(int) len];
        int temp = 0;
        int count = 0;
        while ((temp = is.read()) != -1) {
            bytes[count++] = (byte) temp;
        }
        is.close();
        System.out.println(new String(bytes));
    }
}
