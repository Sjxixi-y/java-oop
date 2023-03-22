package com.itsjxixi.jdk8.lambda.mainA;

import java.util.function.Function;

public class Demo6 {
    public static void main(String[] args) {
        Function<String, String> f = str -> str.toUpperCase();

        System.out.println(handlerString(f, "abcde"));
    }

    public static String handlerString(Function<String, String> f, String str) {
        return f.apply(str);
    }
}
