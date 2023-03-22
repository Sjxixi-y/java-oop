package com.itsjxixi.jdk8.lambda.mainA;

import java.util.function.Consumer;

public class Demo4 {
    public static void main(String[] args) {
        // 1.传入处理方式
        Consumer<Double> c = a -> System.out.println("消费：" + a);
        happy(c, 200000.0);
        // 2.传入处理方式
        happy(a -> System.out.println("收入：" + a), 200000.0);
    }

    public static void happy(Consumer<Double> c, Double a) {
        c.accept(a);
    }
}
