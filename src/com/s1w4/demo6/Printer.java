package com.s1w4.demo6;

public class Printer {
    private int index = 1;

    public synchronized void print1() {
        for (int i = 1; i <= 52 ; i++) {
            if (index % 3 == 0) {
                try {
                    notifyAll();
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print(i);
            index++;
        }
        notifyAll();
    }

    public synchronized void print2() {
        for (int i = 65; i < 90; i++) {
            if (!(index % 3 == 0)) {
                try {
                    notifyAll();
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print((char) i);
            index++;
        }
        notifyAll();
    }
}
