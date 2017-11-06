package com.hy.socket.Test_2;

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


            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String info = null;
            while ((info = br.readLine()) != null) {
                System.out.println("客户端输出信息为" + info);
            }
            PrintWriter pw = new PrintWriter(os);
            pw.write("欢迎您");
            pw.flush();

            pw.close();
            isr.close();
            br.close();
            os.close();
            is.close();

            socket.close();
            serversocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
