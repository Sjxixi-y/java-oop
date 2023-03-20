package com.itsjxixi.collection.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet集合
 */
public class Main8 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        // 添加元素
        s.add(80);
        s.add(81);
        s.add(88);
        s.add(75);
        s.add(90);
        s.add(89);
        s.add(95);
        // 输出
        System.out.println(s.size());
        System.out.println(s);
        // for-each
        for (int i : s) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        // 迭代器
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
