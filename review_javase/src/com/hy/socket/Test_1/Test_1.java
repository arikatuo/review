package com.hy.socket.Test_1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by sumimasah on 2017/9/12.
 */
public class Test_1 {
    public static void main(String[] args) {
        int port = 9999;
        try {
            Socket client = new Socket(InetAddress.getByName("localhost"), port);//创建客户器端套接字
            //InetAddress---表示互联网协议（IP）地址  ---InetAddress.getByName("www.163.com")--在给定主机名的情况下确定主机的IP地址--如果参数为null,获得的是本机的IP地址
            OutputStream o = client.getOutputStream();//打开客户端的输出流
            InputStream i = client.getInputStream();//打开客户端的输入流
            byte[] buf = new byte[100];
            int len = i.read(buf);
            System.out.println(new String(buf, 0, len));//服务器--》客户端

            o.write("hello,I am client".getBytes());//客户端hello,I am client写到输出流--》服务器.write(byte[] b)将字节数组b的各个字节写入当前文件中。
            o.close();//关闭客户端的输出流
            i.close();//关闭客户端的输入流
            client.close();//关闭套接字
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
