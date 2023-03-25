package com.itsjxixi.process.main;

/**
 * 售票
 * 售票口 4 个
 * 票 200
 */
public class Main3 {
    public static void main(String[] args) {
        Runnable su = () -> {
            int piao = 200;
            while (piao > -1) {
                System.out.println(Thread.currentThread().getName() + "抢到了，还剩" + piao-- + "张票");
            }
        };

        Thread t1 = new Thread(su);
        Thread t2 = new Thread(su);
        Thread t3 = new Thread(su);
        Thread t4 = new Thread(su);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
