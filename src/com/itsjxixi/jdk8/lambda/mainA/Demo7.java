package com.itsjxixi.jdk8.lambda.mainA;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张三丰");
        list.add("张学友");
        list.add("张无忌");
        list.add("迪丽热巴");
        list.add("刘亦菲");
        // 以 张 开头
        Predicate<String> p1 = s -> s.startsWith("张");
        // 第二个是 学
        Predicate<String> p2 = s -> s.startsWith("学", 1);
        // 长度是 3
        Predicate<String> p3 = s -> s.length() == 3;

        List<String> strings = filterNames(p3, list);
        System.out.println(strings);
    }

    public static List<String> filterNames(Predicate<String> p, List<String> list) {
        List<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (p.test(s)) {
                list2.add(s);
            }
        }
        return list2;
    }
}
