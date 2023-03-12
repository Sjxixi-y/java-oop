package com.itsjxixi.regex.main;

/**
 * 邮箱校验
 */
public class Main7 {
    public static void main(String[] args) {
        String emil = "268@1314.com.cn";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-z]+)+";
        System.out.println(emil.matches(regex));
    }
}
