package com.itsjxixi.process.main.main10;

public class ShouPiaoKou implements Runnable {
    int piao = 200;
    @Override
    public void run() {
        while (piao > -1) {
            // 同步代码块
            synchronized (this) {
                // 之所以增加判断：是为了去除最后几个的负数问题。
                if (piao <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " 抢到了，还剩" + --piao + "张票");
            }
        }
    }
    // 同步方法
    private void c() {
        if (piao <= 0) {
            return;
        }
        System.out.println(Thread.currentThread().getName() + " 抢到了，还剩" + --piao + "张票");
    }
}