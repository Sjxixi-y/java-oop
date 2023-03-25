package com.itsjxixi.process.mains.main13;

public class Main13 {
    volatile static C c = new C();

    public static void main(String[] args) {
        Runnable ru1 = () -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    c.set("面包");
                } else {
                    c.set("土豆");
                }
            }
        };

        Runnable ru2 = () -> {
            for (int i = 0; i < 10; i++) {
                c.get();
            }
        };

        Thread t1 = new Thread(ru1);
        Thread t2 = new Thread(ru2);


        t1.start();
        t2.start();
    }
}
