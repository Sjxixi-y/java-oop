package com.itsjxixi.regex.main;

/**
 * 按照 # 分割字符串
 */
public class Main3 {
    public static void main(String[] args) {

        String[] arr = text2();
        // 迭代器
        for (String str0:arr) {
            System.out.println(str0);
        }
    }
    // 单一元素
    public static String[] text1() {
        String str = "123456#456123#1";
        String regex = "#";
        return str.split(regex);
    }
    // 重复元素
    public static String[] text2() {
        String str = "abcdeAAabcdBBabcdCC";
        // 去除重复元素。解析：将每个元素看为一个组，当同时有两个或两个以上的相同组出现，分割。
        String regex = "(.)\\1+";
        return str.split(regex);
    }

    // 重复不相同次数元素
    public static String[] text3() {
        String str = "abcAAAabcAAAAabcVVVVabc";
        String regex = "(.)\\1+";
        return str.split(regex);
    }
}
