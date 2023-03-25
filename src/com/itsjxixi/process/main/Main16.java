package com.itsjxixi.process.main;

import java.util.concurrent.*;

/**
 * Callable接口 结合 线程池 使用
 */
public class Main16 {
    public static void main(String[] args) {
        ExecutorService e1 = Executors.newFixedThreadPool(1);

        Callable<Integer> c = () -> {
            int num = 0;
            for (int i = 0; i < 100; i++) {
                num += i;
            }
            System.out.println(num);
            return num;
        };

        e1.submit(c);

        e1.shutdown();
    }
}
