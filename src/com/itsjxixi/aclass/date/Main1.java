package com.itsjxixi.aclass.date;

import java.util.Date;

public class Main1 {
    public static void main(String[] args) {
        Date date = new Date();
        // 欧美习惯的日期表示形式
        System.out.println(date);
        // 中国习惯的日期表示形式
        System.out.println(date.toLocaleString());
        // 获取当前日期到 1970 年的毫秒数
        System.out.println(date.getTime() / 1000 /60 /60 /24 /365);
        // 获取 1900年 到当前的年数
        System.out.println(date.getYear() + 1900);
        // 当前月份 0-11
        System.out.println(date.getMonth() + 1);
        // 本月第几天
        System.out.println(date.getDate());
        // 星期数
        System.out.println(date.getDay());
        // 当前小时数
        System.out.println(date.getHours());
        // 当前分钟数
        System.out.println(date.getMinutes());
        // 当前秒数
        System.out.println(date.getSeconds());
    }
}
