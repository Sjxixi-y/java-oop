package com.itsjxixi.process.main.main13;

public class C {
    // 产品名字
    private String name;
    // 产品是否存在
    private boolean cp = false;

    // 消费
    public synchronized void get() {
        if (!cp) {
            try {
                System.out.println("无商品，消费者等待中");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("正在消费商品" + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        name = "";
        cp = false;
        this.notify();
    }

    // 生产
    public synchronized void set(String name) {
        if (cp) {
            try {
                System.out.println("有商品，生产者等待中。");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("正在生产商品" + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = name;
        cp = true;
        this.notify();
    }
}
