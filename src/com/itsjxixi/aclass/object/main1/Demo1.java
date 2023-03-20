package com.itsjxixi.aclass.object.main1;

public class Demo1 {
    public static void main(String[] args) {
        Object obj = new A();
        // getClass() 返回对象的真实类型（运行时类型）。
        System.out.println(obj.getClass());
    }
}

