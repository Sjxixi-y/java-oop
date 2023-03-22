package com.itsjxixi.aclass.date;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * sql.Date
 */
public class Main2 {
    public static void main(String[] args) {
        // 静态方法，将字符串转为日期。
        Date date = Date.valueOf("2019-03-14");
        System.out.println(date);
        System.out.println(date.getMonth());
        System.out.println(date.getYear() + 1900);

        java.util.Date date2 = new Date(1);
        System.out.println(date2);

        java.util.Date now2 = new java.util.Date();
        Date date3 = new Date(now2.getTime());
        System.out.println(date3);

        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss S E");//模板
        String format = df.format(new java.util.Date());
        System.out.println(format);
    }
}
