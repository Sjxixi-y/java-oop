package com.itsjxixi.internet.main.udp.demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建 Socket
        DatagramSocket socket = new DatagramSocket();
        // 创建数据报包
        String str = "akgenoiqgue";
        byte[] b = str.getBytes();

        DatagramPacket packet = new DatagramPacket(b, b.length, InetAddress.getByName("127.0.0.1"), 25566);
        // 发送数据报包
        socket.send(packet);
        // 关闭资源
        socket.close();
    }
}
