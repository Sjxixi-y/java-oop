package com.itsjxixi.regex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 捕获三个单词的字符串
 */
public class Main5 {
    public static void main(String[] args) {
        String str = "aaa bbb cccc ab abbbb";
        String regex = "\\b[\\w^\\d]{3}\\b";

        //1、将正则规则进行对象的封装
        Pattern p = Pattern.compile(regex);
        //2、通过正则对象获取匹配器对象
        Matcher m = p.matcher(str);

        System.out.println(str);
        // 方法find判断是否还有下一个序列
        while (m.find()) {
            //获取匹配的子序列
            System.out.println(m.group());
            // 获取字符串起点索引、重点索引
            System.out.println(m.start() + " : " + m.end());
        }
    }
}
