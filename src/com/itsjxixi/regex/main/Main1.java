package com.itsjxixi.regex.main;

/**
 * 判断是否为手机号
 * 第一位：1
 * 剩余：0-9
 */
public class Main1 {
    public static void main(String[] args) {
        String str = "12312341234";
        String regex = "1[0-9]{10}";
        System.out.println(str.matches(regex));
    }
}
