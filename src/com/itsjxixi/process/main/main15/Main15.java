package com.itsjxixi.process.main.main15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Callable接口
 */
public class Main15 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> c = () -> {
            int num = 0;
            for (int i = 0; i < 100; i++) {
                num += i;
            }
            return num;
        };

        FutureTask<Integer> task = new FutureTask<Integer>(c);

        Thread t = new Thread(task);
        t.start();
        System.out.println(task.get());
    }
}
