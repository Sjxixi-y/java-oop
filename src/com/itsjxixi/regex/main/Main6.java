package com.itsjxixi.regex.main;

/**
 * 治疗口吃：我我...我我...我要...要要要要...要要要要...学学学学...编编编编编....程程
 */
public class Main6 {
    public static void main(String[] args) {
        String str = "我我...我我...我要...要要要要...要要要要...学学学学...编编编编编....程程";
        // 清除<.>
        String regex = "\\.+";
        // 查询重复元素
        String regex1 = "(.)\\1+";
        String regex2 = "$1";
        System.out.println(str = str.replaceAll(regex, ""));
        System.out.println(str.replaceAll(regex1, regex2));
    }
}
