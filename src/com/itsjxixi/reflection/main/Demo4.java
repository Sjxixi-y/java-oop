package com.itsjxixi.reflection.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * // private void function()
 * Method m4=c.getDeclaredMethod("function");
 * m4.setAccessible(true);
 * m4.invoke(obj);
 */
public class Demo4 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.itsjxixi.reflection.main.clazz.Person");

        // 获取所方法,包括来自父类的方法，但不能获取私有的。
        Method[] m1 = aClass.getMethods();
        // 获取所有的方法，包括私有的方法
        Method[] m2 = aClass.getDeclaredMethods();

        // for (Method method : m1) {
        //     System.out.println(method);
        // }

        Constructor<?> c1 = aClass.getConstructor();
        Object o = c1.newInstance();

        // 获取单个非公共方法
        Method m3 = aClass.getMethod("B", int.class);
        // 获取单个方法，包括非公有
        Method m4 = aClass.getDeclaredMethod("D", int.class);
        System.out.println(m3);

        // 使用方法，返回方法的返回值。
        Object o1 = m3.invoke(o, 1);
        System.out.println(o1);

        // 强制
        m4.setAccessible(true);
        m4.invoke(o, 1);
    }
}
