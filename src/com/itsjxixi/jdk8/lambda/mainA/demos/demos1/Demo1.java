package com.itsjxixi.jdk8.lambda.mainA.demos.demos1;

public class Demo1 {
    public static void main(String[] args) {
        Usb u1 = () -> System.out.println("使用了电脑USB");
        Usb u2 = () -> System.out.println("使用了手机USB");

        run(u1);
        run(u2);

    }

    public static void run(Usb usb) {
        usb.service();
    }
}