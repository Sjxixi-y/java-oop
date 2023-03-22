package com.itsjxixi.jdk8.lambda.mainA;

import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i1) {
                return i1 + 1;
            }
        };

        // 1. 去掉方法签名，只留下具体语句。
        Function<Integer, Integer> f1 = (i1) -> {
            return i1 + 1;
        };

        // 2. 对于只有一条执行语句的情况，可以省略参数、return。并且只有一个参数，参数的括号也可以被删除。
        Function<Integer, Integer> f2 = i1 -> i1 + 1;
    }
}
