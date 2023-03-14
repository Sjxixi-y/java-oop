package com.itsjxixi.process.main.main2;

public class XuanShou implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "领先了");
        }
    }
}
