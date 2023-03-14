package com.itsjxixi.process.main.main3;

public class ShouPiaoKou implements Runnable{
    int piao = 200;

    @Override
    public void run() {
        while (piao > -1) {
            System.out.println(Thread.currentThread().getName() + "抢到了，还剩" + piao-- + "张票");
        }
    }
}
