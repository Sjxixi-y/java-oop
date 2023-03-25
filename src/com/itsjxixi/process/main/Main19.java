package com.itsjxixi.process.main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 4个窗口卖火车票
 */
public class Main19 {
    private static int a = 200;
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Runnable r1 = () -> {
            while (true) {
                lock.lock();
                try {
                    if (a <= 0) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "购买了一张票，还剩" + --a + "张票");
                } finally {
                    lock.unlock();
                }
            }
        };

        Runnable r2 = () -> {
            while (true) {
                lock.lock();
                try {
                    if (a <= 0) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "购买了一张票，还剩" + --a + "张票");
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
