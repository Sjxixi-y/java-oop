package com.itsjxixi.process.main.main19;

/**
 * 4个窗口卖火车票
 */
public class Main19 {
    public static void main(String[] args) {
        A a = new A();
        Runnable r1 = () -> {
                a.piao();
        };
        Runnable r2 = () -> {
                a.piao();
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
