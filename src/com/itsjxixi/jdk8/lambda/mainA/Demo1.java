package com.itsjxixi.jdk8.lambda.mainA;

public class Demo1 {
    public static void main(String[] args) {
        Runnable ru = new Runnable() {
            @Override
            public void run() {
                System.out.println("我是线任务");
            }
        };

        // 1. 去掉方法签名，只留下具体语句。
        Runnable ru1 = () -> {
            System.out.println("我是线任务");
        };

        // 2. 对于只有一条执行语句的情况，可以省略参数。
        Runnable ru2 = () -> System.out.println();
    }
}
