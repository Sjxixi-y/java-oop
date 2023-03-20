package com.itsjxixi.aclass.stringBuffer;

public class demo3 {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("ABCDEFG");

        sbd.insert(1, "我");

        System.out.println(sbd);
    }
}
