package com.itsjxixi.aclass.object.main5;

public class Demo5 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象被销毁了");
    }
}

