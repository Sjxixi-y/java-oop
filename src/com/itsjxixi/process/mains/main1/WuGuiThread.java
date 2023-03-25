package com.itsjxixi.process.mains.main1;

public class WuGuiThread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("乌龟领先了。。。。。");
        }
    }
}
