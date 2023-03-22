package com.itsjxixi.reflection.main;

import com.itsjxixi.reflection.main.clazz.Person;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.getClass()
        Person person = new Person();
        Class clazz1 = person.getClass();

        // 2.Person.class
        Class clazz2 = Person.class;

        // 3.Class.forName("全类名字符串")
        Class clazz3 = Class.forName("com.itsjxixi.reflection.main.clazz.Person");
    }
}
