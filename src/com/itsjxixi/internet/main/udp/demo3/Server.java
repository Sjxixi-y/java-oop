package com.itsjxixi.internet.main.udp.demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(2019);
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 收
            byte[] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, b.length);
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());

            if ("bay".equals(str)) {
                break;
            }
            System.out.println(str);

            // 发
            String str1 = sc.nextLine();
            byte[] b2 = str1.getBytes();
            DatagramPacket dp1 = new DatagramPacket(b2, b2.length, dp.getAddress(), dp.getPort());
            ds.send(dp1);
        }
        ds.close();
    }
}
