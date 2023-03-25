package com.itsjxixi.process.mains.main12;

public class Main12 {
    public static void main(String[] args) throws InterruptedException {
        // A a = new A();
        // B b = new B();

        Runnable ru1 = () -> {
            synchronized (C.obj2) {
                System.out.println(Thread.currentThread().getName() + "获取到了 Obj1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (C.obj1) {
                    System.out.println(Thread.currentThread().getName() + "获取到了 Obj2");
                }
            }
        };

        Runnable ru2 = () -> {
            synchronized (C.obj1) {
                System.out.println(Thread.currentThread().getName() + "获取到了 Obj1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (C.obj2) {
                    System.out.println(Thread.currentThread().getName() + "获取到了 Obj2");
                }
            }
        };

        Thread a = new Thread(ru1);
        Thread b = new Thread(ru2);

        a.start();
        // 解决
        // Thread.sleep(1000);
        b.start();
    }
}