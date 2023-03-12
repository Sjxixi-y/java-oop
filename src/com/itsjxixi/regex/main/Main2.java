package com.itsjxixi.regex.main;

/**
 * 判断是否为座机
 * 区号：3位或四位，首位为0
 * 中间有一个“-”号隔开
 * 电话：八位首位为0，
 */
public class Main2 {
    public static void main(String[] args) {
        String str = "0858-8605932";
        String regex = "0[\\d]{2,3}-0?8[\\d]{5,6}";
        System.out.println(str.matches(regex));
    }
}
