package com.itsjxixi.regex.main;

/**
 * 手机号码，屏蔽中间4位15388967085---153****7085 1538896****
 */
public class Main4 {
    public static void main(String[] args) {
        String str = "15329785523";
        String regex = "(\\d{3})(\\d{4})(\\d{4})";
        String regex1 = "$1****$3";
        System.out.println(str.replaceAll(regex, regex1));
    }
}
