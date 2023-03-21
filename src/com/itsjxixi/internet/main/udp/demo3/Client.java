package com.itsjxixi.internet.main.udp.demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 发
            String str = sc.nextLine();
            byte[] b2 = str.getBytes();
            // 打包
            DatagramPacket dp1 = new DatagramPacket(b2, b2.length, InetAddress.getByName("127.0.0.1"), 2019);
            // 发送
            ds.send(dp1);

            if ("bay".equals(str)) {
                break;
            }

            // 收
            byte[] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, b.length);
            ds.receive(dp);

            String str1 = new String(dp.getData(), 0, dp.getLength());

            System.out.println(str1);
        }
        ds.close();
    }
}
