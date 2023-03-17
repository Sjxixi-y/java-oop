package com.itsjxixi.process.main.main19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A {
    private int a = 200;
    private final Lock lock = new ReentrantLock();

    public void piao() {
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
    }
}