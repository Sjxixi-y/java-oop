package com.itsjxixi.process.main.main13;

import java.lang.invoke.VolatileCallSite;

public class Main13 {
    volatile static C c = new C();

    public static void main(String[] args) {

        // S s = new S(c);
        // X x = new X(c);
        // s.start();
        // x.start();

        Runnable ru1 = () -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    c.set("面包");
                } else {
                    c.set("土豆");
                }
            }
        };

        Runnable ru2 = c::get;

        Thread t1 = new Thread(ru1);
        Thread t2 = new Thread(ru2);


        t1.start();
        t2.start();
    }
}
