package com.hy.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by sumimasah on 2017/9/11.
 */
public class Test_1 {
    public static void main(String[] args) {
        try {
            // 创建一个文件读取流对象，和指定名称的文件关联，保证文件存在，
            // 如果不存在,异常
            FileWriter fileWriter = new FileWriter("demo.txt");
            fileWriter.write("abcde");
            fileWriter.close();

            FileReader fileReader = new FileReader("demo.txt");
            // 读取单个字符,自动往下读
            int cd = fileReader.read();
            System.out.println((char) cd);

            //全部打印
            int ch = 0;
            while ((ch = fileReader.read()) != -1) {
                System.out.println(ch);
            }

            fileReader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
