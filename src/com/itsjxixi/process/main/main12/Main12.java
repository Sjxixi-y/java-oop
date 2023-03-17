package com.itsjxixi.process.main.main12;

public class Main12 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();

        a.start();
        // 解决
        // Thread.sleep(1000);
        b.start();
    }
}
