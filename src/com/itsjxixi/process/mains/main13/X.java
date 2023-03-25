package com.itsjxixi.process.mains.main13;

/**
 * 消费者
 */
public class X extends Thread {
    C c;

    public X(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            c.get();
        }
    }
}
