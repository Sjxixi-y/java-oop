package com.s1w4;

import java.util.HashMap;

public class Main {
    static int add = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 100000; i++) {
                    add++;
                }
                System.out.println("T2" + add);
            });
            t2.start();

            // try {
            //     t2.join();
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }

            for (int i = 0; i < 100000; i++) {
                add++;
            }
            System.out.println("T1" + add);
        });

        t1.start();

        // t1.join();

        System.out.println("最后：" + add);
    }
}
