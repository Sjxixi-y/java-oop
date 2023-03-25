package com.itsjxixi.process.main;

/**
 * yield
 */
public class Main8 {
    public static void main(String[] args) {
        Runnable ru = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "：" + i);
                Thread.yield();
            }
        };
        Thread t1 = new Thread(ru);
        Thread t2 = new Thread(ru);
        t1.start();
        t2.start();
    }
}
