package com.itsjxixi.process.main;

/**
 *  强势阻塞
 */
public class Main5 {
    public static void main(String[] args) throws InterruptedException {
        Runnable ru = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("-------" + Thread.currentThread().getName() + "--------");
            }
        };

        for (int i = 0; i < 10; i++) {
            System.out.println("__________main___________");
            if (i == 5) {
                Thread t1 = new Thread(ru);
                Thread t2 = new Thread(ru);

                t1.start();
                t2.start();
                t1.join();
                t2.join();
            }
        }
    }
}
