package com.hy.socket.Test_2;

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

            PrintWriter pw = new PrintWriter(os);
            pw.write("用户名：admin;密码：123");
            pw.flush();
            socket.shutdownOutput();

            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String info = null;

            while ((info = br.readLine()) != null) {
                System.out.println("服务器说" + info);
            }

            pw.close();
            br.close();
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
