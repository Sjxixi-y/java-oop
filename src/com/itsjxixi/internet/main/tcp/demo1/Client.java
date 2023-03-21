package com.itsjxixi.internet.main.tcp.demo1;

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

        // 关流
        dos.close();
        socket.close();
    }
}
