package com.itsjxixi.internet.main.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        // 创建
        URL url = new URL("http://www.baidu.com:80/index.html#aa?cansu=bjsxt");
        // 获取 端口
        System.out.println(url.getDefaultPort());
        // 获取 文件名
        System.out.println(url.getFile());
        // 获取 域名
        System.out.println(url.getHost());
        // 获取 文件名
        System.out.println(url.getPath());
        // 获取 端口
        System.out.println(url.getPort());
        // 获取 协议
        System.out.println(url.getProtocol());
        // 获取
        System.out.println(url.getQuery());
        // 获取 参数
        System.out.println(url.getRef());
    }
}
