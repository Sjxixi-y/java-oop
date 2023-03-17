package com.itsjxixi.process.main.main17;

import java.util.concurrent.*;

/**
 * Callable接口 结合 线程池 使用
 */
public class Main17 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService e1 = Executors.newFixedThreadPool(1);
        // 线程任务提交，线程开始执行
        Future<Integer> f1 = e1.submit(() -> {
            int num = 0;
            for (int i = 0; i < 100; i++) {
                num += i;
            }
            System.out.println(num);
            return num;
        });
        // 线程任务提交，线程开始执行
        Future<Integer> f2 = e1.submit(() -> {
            int num = 0;
            for (int i = 0; i < 100; i++) {
                num += i;
            }
            System.out.println(num);
            return num;
        });
        System.out.println(f1.get() + f2.get());
        e1.shutdown();
    }
}
