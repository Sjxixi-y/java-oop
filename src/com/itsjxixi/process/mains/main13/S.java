package com.itsjxixi.process.mains.main13;

/**
 * 生产者
 */
public class S extends Thread {
    C c;

    public S(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (index % 2 == 0) {
                c.set("面包");
            } else {
                c.set("牛奶");
            }
            index++;
        }
    }
}
