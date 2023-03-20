package com.itsjxixi.aclass.object.main4;

public class Demo4 {
    public static void main(String[] args) {
        Object a = new A();
        Object b = new A();
        // toString() 返回当前对象的字符串形式
        System.out.println(a.equals(b));
    }
}

