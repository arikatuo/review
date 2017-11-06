package com.hy.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by sumimasah on 2017/9/11.
 */
public class Test_2 {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("demo.txt");
            char[] buf = new char[4];

            int num = fileReader.read(buf);

            System.out.println("num:" + num + new String(buf));

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}