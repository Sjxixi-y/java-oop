package com.itsjxixi.process.main.main12;

public class A extends Thread{
    @Override
    public void run() {
        synchronized (C.obj1) {
            System.out.println("A拿到了obj1");
            synchronized (C.obj2) {
                System.out.println("A拿到了obj2");
            }
        }
    }
}
