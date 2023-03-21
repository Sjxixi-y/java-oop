package com.itsjxixi.internet.main.tcp.demo2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 25550);

        // 创建输出流
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        // 发送数据
        String str = "在线荷官，性感发牌。";
        dos.writeUTF(str);

        // 创建输入流
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        // 接收客户端输出
        System.out.println(dis.readUTF());

        // 关流
        dis.close();
        dos.close();
        socket.close();
    }
}
