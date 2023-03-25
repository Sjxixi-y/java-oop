package com.itsjxixi.process.main;

/**
 * setDaemon(true)
 */
public class Main9 {
    public static void main(String[] args) {
        Runnable ru = () -> {
            while (true) {
                System.out.println("A________________________________");
            }
        };
        Thread t1 = new Thread(ru);
        // 是否为后台线程，设置为 true.
        t1.setDaemon(true);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main==================");
        }
    }
}
