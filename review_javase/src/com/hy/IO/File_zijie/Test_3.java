package com.hy.IO.File_zijie;

import java.io.File;
import java.io.IOException;

import java.io.*;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_3 {
    public static void main(String[] args) throws IOException {
        String name = "d:" + File.separator + "a.txt";
        File file = new File(name);

        InputStream ip = new FileInputStream(file);

        byte[] bytes = new byte[1024];
        ip.read(bytes);
        ip.close();
//        int i = ip.read(bytes);
//        ip.close();

        System.out.println(new String(bytes));
    }
}
