package com.itsjxixi.aclass.stringBuffer;

public class demo5 {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder();
        String str = sbd.toString();
        StringBuilder sbd1 = new StringBuilder(str);
        System.out.println(str);
    }
}
