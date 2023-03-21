package com.itsjxixi.internet.main.intAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IntAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // 创建对象
        InetAddress ip1 = InetAddress.getLocalHost();
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        // getHostName 获取计算机名称
        System.out.println(ip1.getHostName());
        System.out.println(ip2.getHostName());
        // getHostAddress 获取 IP 地址
        System.out.println(ip1.getHostAddress());
        System.out.println(ip2.getHostAddress());
    }
}
