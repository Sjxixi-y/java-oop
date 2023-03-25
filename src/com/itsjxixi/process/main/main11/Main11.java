package com.itsjxixi.process.main.main11;

/**
 * 多个用户一个账户取钱
 */
public class Main11 {
    public static void main(String[] args) {
        A a = new A();
        Thread f = new Thread(a, "A");
        Thread p = new Thread(a, "B");
        Thread c = new Thread(a, "C");

        f.start();
        p.start();
        c.start();
    }
}
