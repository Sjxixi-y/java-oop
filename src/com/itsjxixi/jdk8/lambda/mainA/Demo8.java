package com.itsjxixi.jdk8.lambda.mainA;

public class Demo8 {
    public static void main(String[] args) {
        // 打印分隔符
        Runnable r = () -> System.out.println("-------------------");

        r.run();
    }
}
