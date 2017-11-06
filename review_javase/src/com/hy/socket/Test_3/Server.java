package com.hy.socket.Test_3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by sumimasah on 2017/9/13.
 */
public class Server {
    public static void main(String[] args) {
        try {

            ServerSocket serversocket = new ServerSocket(8888);
            Socket socket = serversocket.accept();
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();

            os.write("服务器".getBytes());

            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes,0,len));






            os.close();
            is.close();

            socket.close();
            serversocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
