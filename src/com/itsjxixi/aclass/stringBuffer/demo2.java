package com.itsjxixi.aclass.stringBuffer;

public class demo2 {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder("ABCDEFG");

        sbd.delete(1,3);

        System.out.println(sbd);
    }
}
