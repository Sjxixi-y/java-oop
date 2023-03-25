package com.itsjxixi.process.mains.main11;

public class A implements Runnable {
    B b = new B();

    @Override
    public void run() {
        while (b.getBalance() > 100) {
            synchronized (this) {
                if (b.getBalance() > 100) {
                    b.setBalance();
                    System.out.println(Thread.currentThread().getName() + "取走了100元， 还剩" + b.getBalance());
                } else {
                    System.out.println(Thread.currentThread().getName() + "取钱失败， 还剩" + b.getBalance());
                }
            }
        }
    }
}
