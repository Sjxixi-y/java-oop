package com.itsjxixi.aclass.number.integer;

public class Demo1 {
    public static void main(String[] args) {
        // parseInt
        String str = "123";
        int a = Integer.parseInt(str);
        System.out.println(a);

        String str2 = "10010";
        // 以二进制形式转换
        int x = Integer.parseInt(str2, 2);
        System.out.println("x:" + x);
        // valueOf
        Integer ia = Integer.valueOf(10);
        Integer ib = Integer.valueOf("123456");
        System.out.println(ia + "" + ib);
        // toBinaryString
        System.out.println(Integer.toBinaryString(11));
        // toString
        System.out.println(Integer.toString(100).getClass());
        // 缓冲区
        Integer a1 = 1;
        Integer a2 = 1;
        System.out.println(a1 == a2);

        Integer a3 = 200;
        Integer a4 = 200;
        System.out.println(a3 == a4);
    }
}
