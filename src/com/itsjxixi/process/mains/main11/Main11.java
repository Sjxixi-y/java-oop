package com.itsjxixi.process.mains.main11;

/**
 * 多个用户一个账户取钱
 */
public class Main11 {
    public static void main(String[] args) {
        // A a = new A();
        // Thread f = new Thread(a, "A");
        // Thread p = new Thread(a, "B");
        // Thread c = new Thread(a, "C");
        //
        // f.start();
        // p.start();
        // c.start();

        B b =new B();
        Runnable ru = () -> {
            while (b.getBalance() > 100) {
                synchronized (B.class) {
                    if (b.getBalance() > 100) {
                        b.setBalance();
                        System.out.println(Thread.currentThread().getName() + "取走了100元， 还剩" + b.getBalance());
                    } else {
                        System.out.println(Thread.currentThread().getName() + "取钱失败， 还剩" + b.getBalance());
                    }
                }
            }
        };

        Thread f = new Thread(ru, "A");
        Thread p = new Thread(ru, "B");
        Thread c = new Thread(ru, "C");

        f.start();
        p.start();
        c.start();
    }
}
