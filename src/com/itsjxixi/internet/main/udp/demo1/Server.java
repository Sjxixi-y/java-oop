package com.itsjxixi.internet.main.udp.demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建 socket
        DatagramSocket socket = new DatagramSocket(25566);

        // 创建数据包，

        byte[] b = new byte[1024];

        DatagramPacket packet = new DatagramPacket(b, b.length);

        // 接收数据
        socket.receive(packet);
        // 输出
        System.out.println("数据："+new String(packet.getData(),0,packet.getLength()));
        System.out.println("IP:"+packet.getAddress());//另外一端的IP
        System.out.println("端口："+packet.getPort());//另外一端的端口

        // 关闭
        socket.close();
    }
}
