package com.itsjxixi.process.main.mains.main1;

/**
 * 龟兔赛跑
 */
public class Main1 {
    public static void main(String[] args) {
        WuGuiThread wu = new WuGuiThread();

        TuZiRunnable tu = new TuZiRunnable();
        Thread th1 = new Thread(tu);

        wu.start();
        th1.start();
    }
}
