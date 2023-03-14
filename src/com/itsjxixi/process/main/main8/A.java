package com.itsjxixi.process.main.main8;

public class A extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("a：" + i);
            // 增加等待，让结果更明显
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Thread.yield();
        }
    }
}
