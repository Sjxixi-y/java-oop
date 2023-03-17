package com.itsjxixi.process.main.main18;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A {
    // lock锁对象
    private Lock lock = new ReentrantLock();
    // 数组
    private String[] arr = {"A", "B", "C", null, null};
    // 数组元素长度
    private int size = 3;

    public void add(String str) {
        lock.lock();
        arr[size++] = str;
        try {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            lock.unlock();
        }
    }
    public void z() {
        System.out.println(Arrays.toString(arr));
    }
}
