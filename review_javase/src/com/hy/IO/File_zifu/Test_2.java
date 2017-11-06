package com.hy.IO.File_zifu;


import java.io.*;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_2 {
    public static void main(String[] args) throws IOException {
        String name = "d:" + File.separator + "a.txt";
        File file = new File(name);

        Writer writer = new FileWriter(file,true);
        String str = "china";

        writer.write(str);
        writer.close();

    }
}
