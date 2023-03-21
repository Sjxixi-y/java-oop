package com.itsjxixi.internet.main.udp.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建 socket
        DatagramSocket socket = new DatagramSocket(25566);

        // 创建数据包，

        byte[] b = new byte[1024];

        DatagramPacket packet1 = new DatagramPacket(b, b.length);

        // 接收数据
        socket.receive(packet1);
        // 输出
        System.out.println("数据：" + new String(packet1.getData(), 0, packet1.getLength()));
        System.out.println("IP:" + packet1.getAddress());//另外一端的IP
        System.out.println("端口：" + packet1.getPort());//另外一端的端口

        String str = "澳门赌场";
        byte[] b2 = str.getBytes();

        DatagramPacket packet2 = new DatagramPacket(b2, b2.length, packet1.getAddress(), packet1.getPort());
        // 发送数据报包
        socket.send(packet2);

        // 关闭
        socket.close();
    }
}
