package com.itsjxixi.reflection.main;

import java.lang.reflect.Field;

/**
 * getFields()  只能获取 public 属性
 * getField(String name)
 * getDeclaredField(String name)
 * getDeclaredFields()   获取所有的属性
 * setAccessible(true) //暴力访问   私有属性
 * addressfiled.set(obj, "北京");// obj.setAddress("北京");
 * addressfiled.get(obj)
 */
public class Demo3 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.itsjxixi.reflection.main.clazz.Person");

        Object o = aClass.newInstance();
        // 获取全部公有的属性
        Field[] f1 = aClass.getFields();
        for (Field f : f1) {
            System.out.println(f);
        }

        System.out.println();

        // 获取指定的公有的属性
        Field f2 = aClass.getField("b");
        System.out.println(f2);

        System.out.println();

        // 获取指定的私有的属性
        Field f3 = aClass.getDeclaredField("a");
        System.out.println(f3);

        System.out.println();

        // 获取全部属性（包括私有的）
        Field[] f4 = aClass.getDeclaredFields();
        for (Field f : f4) {
            System.out.println(f);
        }

        System.out.println();

        // 获取公有的指定的属性
        int o1 = (int) f2.get(o);
        System.out.println(o1);

        // 暴力访问
        f3.setAccessible(true);
        int o2 = (int) f3.get(o);
        System.out.println(o2);
    }
}
