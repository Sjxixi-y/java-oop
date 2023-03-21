package com.itsjxixi.internet.main.inetSocketAddressDemo;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InetSocketAddressDemo {
    public static void main(String[] args) {
        // 创建对象
        InetSocketAddress isa = new InetSocketAddress("127.0.0.1", 8080);
        // 获取 IP
        System.out.println(isa.getHostName());
        // 获取 端口
        System.out.println(isa.getPort());
        // 获取 IntAddress 对象
        InetAddress ia = isa.getAddress();
    }
}
