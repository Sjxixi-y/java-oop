package com.itsjxixi.process.main.main2;

/**
 * 一个线程
 * 4人跑步
 */
public class Main2 {
    public static void main(String[] args) {
        XuanShou su = new XuanShou();

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
