package com.itsjxixi.aclass.calendar;

import java.util.Calendar;

/**
 *  * Calendar cal = Calendar.getInstance();
 * 	 * Calendar cal = new GregorianCalendar();
 * 	 * cal.get(Calendar.YEAR)
 * 	 * cal.set(Calendar.MONTH, 1);
 * 	 * cal.add(Calendar.DATE, 1);
 * 	 * cal.setTime(sdate);
 * 	 * cal.getActualMaximum(Calendar.DATE)
 */
public class Main1 {
    public static void main(String[] args) {
        // 获取当前时间的日历对象
        Calendar cal = Calendar.getInstance();
        // 获取当前年
        System.out.println(cal.get(Calendar.YEAR));//2023
        System.out.println(cal.get(Calendar.MONTH));//3  0-11
        System.out.println(cal.get(Calendar.DATE));//21
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));//3    日1 一2  二3
        System.out.println(Calendar.SATURDAY);

        // 获取当前月份的最大最小值。
        System.out.println(cal.getActualMaximum(Calendar.DATE));
        System.out.println(cal.getActualMinimum(Calendar.DATE));

        cal.set(Calendar.MONTH, 1);
        System.out.println(cal);
    }
}
