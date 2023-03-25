package com.s1w4.demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 {
    public static void main(String[] args) {
        A a = new A();
        ExecutorService e = Executors.newFixedThreadPool(4);
        Runnable r = a::piao;
        for (int i = 0; i < 4; i++) {
            e.submit(r);
        }
        e.shutdown();
    }
}
