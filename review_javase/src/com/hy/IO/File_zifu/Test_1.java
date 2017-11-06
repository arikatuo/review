package com.hy.IO.File_zifu;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_1 {
    public static void main(String[] args) throws IOException {
        String name = "d:" + File.separator + "a.txt";
        File file = new File(name);

        Reader reader = new FileReader(file);
        char[] chars = new char[100];
        int len = reader.read(chars);

        reader.close();
        System.out.println(new String(chars, 0, len));
    }
}
