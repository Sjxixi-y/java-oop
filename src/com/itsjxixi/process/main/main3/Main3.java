package com.itsjxixi.process.main.main3;

import com.itsjxixi.process.main.main2.XuanShou;

/**
 * 售票
 * 售票口 4 个
 * 票 200
 */
public class Main3 {
    public static void main(String[] args) {
        ShouPiaoKou su = new ShouPiaoKou();

        Thread t1 = new Thread(su);
        Thread t2 = new Thread(su);
        Thread t3 = new Thread(su);
        Thread t4 = new Thread(su);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
