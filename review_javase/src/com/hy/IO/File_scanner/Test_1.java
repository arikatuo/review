package com.hy.IO.File_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_1 {

    public static void main(String[] args) {

        String path = "d:" + File.separator + "a.txt";
        File file = new File(path);
        Scanner sca = null;
        String str = null;
        int a;
        try {
            sca = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        a.TXT里面不能有中文，有中文报错。
        str = sca.next();

        System.out.println("从文件中读取的内容是：" + str);
    }
}
