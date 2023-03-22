package com.itsjxixi.reflection.main;

import java.lang.reflect.Constructor;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.itsjxixi.reflection.main.clazz.Person");
        // 全部
        Constructor[] c1 = clazz.getConstructors();

        for (Constructor str: c1) {
            System.out.println(str);
        }

        System.out.println();

        // 获取指定的
        Constructor c2 = clazz.getConstructor(String.class);

        System.out.println(c2);

        System.out.println();
        // 获取所有
        Constructor[] c3 = clazz.getDeclaredConstructors();
        for (Constructor str: c3) {
            System.out.println(str);
        }

        System.out.println();
        // 获取单个任意权限
        Constructor c4 = clazz.getDeclaredConstructor(int.class);
        Constructor c5 = clazz.getConstructor();

        System.out.println(c4);

        System.out.println();

        // 创建对象 无参
        Object o = c5.newInstance();
        System.out.println(o);
        // 创建对象 带参
        c4.setAccessible(true);
        Object b = c4.newInstance(123);
    }
}
