package com.hy.IO.File_zijie;

import java.io.File;
import java.io.IOException;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_1 {
    public static void main(String[] args) {
        String fileName = "D:" + File.separator+"a.txt";

        File f = new File(fileName);

        System.out.println(f);
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String[] names = f.list();
//
//        for (String s : names) {
//            System.out.println(s);
//        }

    }
}
