package com.itsjxixi.process.main.main13;

public class Main13 {
    public static void main(String[] args) {
        C c = new C();
        S s = new S(c);
        X x = new X(c);

        s.start();
        x.start();
    }
}
