package com.itsjxixi.process.main.main9;

/**
 *  setDaemon(true)
 */
public class Main9 {
    public static void main(String[] args) {
        A a = new A();
        a.setDaemon(true);
        a.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main==================");
        }
        // 是否为后台线程，设置为 true.
    }
}
