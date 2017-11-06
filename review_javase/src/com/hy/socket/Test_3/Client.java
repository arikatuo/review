package com.hy.socket.Test_3;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by sumimasah on 2017/9/13.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);

            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();

            os.write("客户端".getBytes());

            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes, 0, len));



            os.close();
            is.close();
            socket.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
