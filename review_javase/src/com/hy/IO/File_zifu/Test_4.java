package com.hy.IO.File_zifu;


import java.io.*;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_4 {
    public static void main(String[] args) throws IOException {
        String name = "d:" + File.separator + "c.txt";
        File file = new File(name);

        //Writer writer = new FileWriter(file, true);

        Reader reader = new InputStreamReader(new FileInputStream(file));

        char[] bytes = new char[1024];

        reader.read(bytes);

        reader.close();
        System.out.println(new String(bytes));

    }
}
