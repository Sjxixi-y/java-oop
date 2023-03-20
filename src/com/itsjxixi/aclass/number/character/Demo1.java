package com.itsjxixi.aclass.number.character;

public class Demo1 {
    public static void main(String[] args) {
        Character c = null;
        // 判断是否为数字
        System.out.println(Character.isDefined(c));
        // 判断是否为字符
        System.out.println(Character.isLetter(c));
        // 判断是否为小写字符
        System.out.println(Character.isLowerCase(c));
        // 判断是否为大写字符
        System.out.println(Character.isUpperCase(c));
    }
}
