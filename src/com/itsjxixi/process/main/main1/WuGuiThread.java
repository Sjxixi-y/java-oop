package com.itsjxixi.process.main.main1;

public class WuGuiThread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("乌龟领先了。。。。。");
        }
    }
}
