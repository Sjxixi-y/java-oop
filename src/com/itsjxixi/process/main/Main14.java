package com.itsjxixi.process.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池创建
 */
public class Main14 {
    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(2);

        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "A");
            }
        };

        for (int i = 0; i < 2; i++) {
            e.submit(r);
        }

        e.shutdown();
    }
}
