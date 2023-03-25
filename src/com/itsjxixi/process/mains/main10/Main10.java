package com.itsjxixi.process.mains.main10;

/**
 * 售票
 * 售票口 4 个
 * 票 200
 */
public class Main10 {
    public static void main(String[] args) {
        ShouPiaoKou su = new ShouPiaoKou();

        Runnable ru = () -> {
            int piao = 200;
            while (piao > -1) {
                // 同步代码块
                synchronized (Main10.class) {
                    // 之所以增加判断：是为了去除最后几个的负数问题。
                    if (piao <= 0) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + " 抢到了，还剩" + --piao + "张票");
                }
            }
        };

        // Thread t1 = new Thread(su, "售票处A");
        // Thread t2 = new Thread(su, "售票处B");
        // Thread t3 = new Thread(su, "售票处C");
        // Thread t4 = new Thread(su, "售票处D");

        Thread t1 = new Thread(ru, "售票处A");
        Thread t2 = new Thread(ru, "售票处B");
        Thread t3 = new Thread(ru, "售票处C");
        Thread t4 = new Thread(ru, "售票处D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
