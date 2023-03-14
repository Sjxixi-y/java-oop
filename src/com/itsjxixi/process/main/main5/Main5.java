package com.itsjxixi.process.main.main5;

/**
 *  强势阻塞
 */
public class Main5 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("__________main___________");
            if (i == 5) {
                IJoin ij = new IJoin("name");
                ij.start();
                ij.join();
            }
        }
    }
}
