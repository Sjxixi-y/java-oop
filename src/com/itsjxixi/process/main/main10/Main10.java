package com.itsjxixi.process.main.main10;

/**
 * 售票
 * 售票口 4 个
 * 票 200
 */
public class Main10 {
    public static void main(String[] args) {
        ShouPiaoKou su = new ShouPiaoKou();

        Thread t1 = new Thread(su, "售票处A");
        Thread t2 = new Thread(su, "售票处B");
        Thread t3 = new Thread(su, "售票处C");
        Thread t4 = new Thread(su, "售票处D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
