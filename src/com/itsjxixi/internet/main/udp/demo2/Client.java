package com.itsjxixi.internet.main.udp.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建 Socket
        DatagramSocket socket = new DatagramSocket();
        // 创建数据报包
        String str = "性感荷官在线发牌";
        byte[] b = str.getBytes();

        DatagramPacket packet = new DatagramPacket(b, b.length, InetAddress.getByName("127.0.0.1"), 25566);
        // 发送数据报包
        socket.send(packet);

        // 创建数据包，

        byte[] b2 = new byte[1024];

        DatagramPacket packet1 = new DatagramPacket(b2, b.length);

        // 接收数据
        socket.receive(packet1);
        // 输出
        System.out.println("数据：" + new String(packet1.getData(), 0, packet1.getLength()));
        System.out.println("IP:" + packet1.getAddress());//另外一端的IP
        System.out.println("端口：" + packet1.getPort());//另外一端的端口

        // 关闭资源
        socket.close();
    }
}
