package com.itsjxixi.internet.main.tcp.demo2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建
        ServerSocket socket = new ServerSocket(25550);

        // 接收
        Socket s1 = socket.accept();

        // 创建输入流
        InputStream is = s1.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        // 接收客户端输出
        System.out.println(dis.readUTF());

        // 创建输出流
        OutputStream os = s1.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        // 发送数据
        String str = "澳门赌场。";
        dos.writeUTF(str);

        // 关闭流
        dis.close();
        s1.close();
        socket.close();
    }
}
