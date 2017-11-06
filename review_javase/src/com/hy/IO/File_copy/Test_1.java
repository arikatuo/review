package com.hy.IO.File_copy;

import java.io.*;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_1 {
    public static void main(String[] args) throws IOException {
        String name1 = "d:" + File.separator + "a.txt";
        String name2 = "d:" + File.separator + "b.txt";

        File file1 = new File(name1);
        File file2 = new File(name2);
       // file2.createNewFile();

        InputStream is = new FileInputStream(file1);
        OutputStream os = new FileOutputStream(file2);
        while (is.read() != -1) {
            os.write(is.read());
        }
        os.close();
        is.close();


    }
}
