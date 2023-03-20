package com.itsjxixi.aclass.string;

/**
 * 创建方式
 */
public class Demo1 {
    public static void main(String[] args) {
        // 赋值
        String str1 = "acd";
        // 构造方法
        String str2 = new String("avv");
        // 字节转换
        byte[] b = {99, 97, 12};
        String str3 = new String(b, 0, b.length);
        // 字符转换
        char[] c = {'a', 'b', 'c'};
        String str4 = new String(c, 0, c.length);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
