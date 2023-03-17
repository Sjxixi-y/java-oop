package com.itsjxixi.process.main.main18;

import java.util.Arrays;

/**
 * 分别向数组插入数据。
 */
public class main18 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        Runnable r1 = () -> {
            a.add("D");
            a.z();
        };
        Runnable r2 = () -> {
            a.add("E");
            a.z();
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        // t1.join();
        // t2.join();
    }
}
