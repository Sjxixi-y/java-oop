package com.itsjxixi.io.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * IO初体验
 */
public class Main1 {
    public static void main(String[] args) {
        m();
    }

    public static void m() {

        // 创建输入流对象
        FileInputStream fil = null;
        try {
            // 创建文件对象
            File file = new File("E:\\A\\1.txt");
            // 赋值
            fil = new FileInputStream(file);
            // 创建容器，available --- 准确计算字节数
            byte[] vy = new byte[fil.available()];
            // 写入容器，并且返回数组实际长度，
            int read = fil.read(vy);
            // 循环写入，只要还有实际长度就不断写入
            while (read != -1) {
                // 将数组转为字符串输出
                String s = new String(vy);
                System.out.println(s);
                // 再次写入
                read = fil.read(vy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                assert fil != null;
                fil.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
