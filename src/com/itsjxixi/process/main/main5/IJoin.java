package com.itsjxixi.process.main.main5;

public class IJoin extends Thread{
    public IJoin() {
    }

    public IJoin(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("123456789");
        }

    }
}
