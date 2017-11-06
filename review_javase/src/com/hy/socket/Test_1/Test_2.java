package com.hy.socket.Test_1;

import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by sumimasah on 2017/9/12.
 */
class Test_2 {
    public static void main(String[] args) {
        int port = 9999;/*开辟一个端口就是开启一个服务了---端口的分配必须是唯一的，因为端口是为了唯一标识每台计算机唯一服务的
         * 端口号是从0~65535之间的，前1024个端口已被Tcp/Ip作为保留端口，因此自己分配的端口只能是1024以后的*/
        try {
            ServerSocket server = new ServerSocket(port);//创建服务器端套接字
            Socket client = server.accept();//监听器。服务器端建立自己的套接字

            OutputStream o = client.getOutputStream();//服务器端打开自己的输出流
            BufferedOutputStream b = new BufferedOutputStream(o);//使用带缓存的输出流
            InputStream i = client.getInputStream();//服务器端打开自己输入流

            o.write("hello,I am server".getBytes());//服务器hello,I am server写入输出流--》客户端
            b.write("hello,I am server".getBytes());
            b.flush();

            byte[] buf = new byte[100];//存储套接字通道中读到的服务器端输出流的字符流
            int len = i.read(buf);//read(byte[] b)从当前服务器端的输入流中（即客户端的输出流）读取出来存储到字符数组buf中,该方法返回的是读出的字符数组长度。
            System.out.println(new String(buf, 0, len));//客户端--》服务器 。new String(buf,0,len)是将字符数组buf从下标零到len的每个字符构成一个字符串
            //System.out是java.io.OutputStream类型的变量


            o.close();//服务器端关闭输出流
            b.close();
            i.close();//客户端关闭输入流
            client.close();//客户端关闭套接字
            server.close();//服务端关闭套接字
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}