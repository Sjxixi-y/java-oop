package com.itsjxixi.process.mains.main10;

public class ShouPiaoKou implements Runnable {
    int piao = 200;
    @Override
    public void run() {
        c();
    }
    // 同步方法
    public synchronized void c() {
        while (true){
            if (piao <= 0) {
                return;
            }
            System.out.println(Thread.currentThread().getName() + " 抢到了，还剩" + --piao + "张票");
        }
    }
}