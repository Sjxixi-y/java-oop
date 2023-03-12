package com.itsjxixi.collection.main;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *  储存学生成绩
 */
public class Main10 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();

        set.add(88);
        set.add(80);
        set.add(89);
        set.add(79);
        set.add(89);
        set.add(90);
        // 元素不重复
        System.out.println(set);
        System.out.println(set.size());
    }
}
