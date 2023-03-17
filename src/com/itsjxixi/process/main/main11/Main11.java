package com.itsjxixi.process.main.main11;

/**
 * 多个用户一个账户取钱
 */
public class Main11 {
    public static void main(String[] args) {
        A a = new A();
        Thread f = new Thread(a, "范豪");
        Thread p = new Thread(a, "彭志雄");
        Thread c = new Thread(a, "陈俊豪");

        f.start();
        p.start();
        c.start();
    }
}
