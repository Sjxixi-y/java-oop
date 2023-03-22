package com.itsjxixi.reflection.main.clazz;

public class Person {
    private int a;
    public int b;
    public int c;
    private int d;

    public Person() {

    }

    private Person(int a) {
        System.out.println(a);
    }

    public Person(String s) {
        System.out.println(s);
    }

    public void A() {

    }

    public int B(int a) {
        System.out.println(a);
        return a + 1;
    }

    private void C() {

    }

    private void D(int a) {
        System.out.println(a);
    }
}
