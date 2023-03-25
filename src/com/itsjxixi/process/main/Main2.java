package com.itsjxixi.process.main;

/**
 * 一个线程
 * 4人跑步
 */
public class Main2 {
    public static void main(String[] args) {
        Runnable su = () -> {
            int a = 0;
            while (a++ < 10000) {
                System.out.println(Thread.currentThread().getName() + " - 领先了");
            }
        };

        Thread t1 = new Thread(su);
        Thread t2 = new Thread(su);
        Thread t3 = new Thread(su);

        t1.start();
        t2.start();
        t3.start();
    }
}
