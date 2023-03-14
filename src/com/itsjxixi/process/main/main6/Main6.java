package com.itsjxixi.process.main.main6;

/**
 * 预备 1 2 3 发射
 */
public class Main6 {
    public static void main(String[] args) {
        System.out.print("准备");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print('\r');
        for (int i = 1; i < 4; i++) {
            try {
                System.out.print(i);
                Thread.sleep(1000);
                System.out.print('\r');
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("发射");
    }
}
