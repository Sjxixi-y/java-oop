package com.itsjxixi.process.main;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 分别向数组插入数据。
 */
public class Main18 {
    static Lock lock = new ReentrantLock();

    static String[] arr = {"A", "B", "C", null, null};

    static int size = 3;

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = () -> {
            try {
                lock.lock();
                arr[size++] = "D";
            } finally {
                lock.unlock();
            }
            System.out.println(Arrays.toString(arr));
        };

        Runnable r2 = () -> {
            try {
                lock.lock();
                arr[size++] = "E";
            } finally {
                lock.unlock();
            }
            System.out.println(Arrays.toString(arr));
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        System.out.println(Arrays.toString(arr));
    }
}
