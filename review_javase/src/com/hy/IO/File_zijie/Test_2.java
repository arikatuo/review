package com.hy.IO.File_zijie;

import java.io.*;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_2 {
    public static void main(String[] args) throws IOException {
        String name = "d:" + File.separator + "a.txt";
        File f = new File(name);
        f.createNewFile();
        OutputStream os = new FileOutputStream(f);
        String str = "你好";
        byte[] bytes = str.getBytes();
        os.write(bytes);
        os.close();
    }
}
