package com.itsjxixi.collection.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *  set接口常用方法
 */
public class Main7 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 添加   add
        set.add("今天是个开心的早八");
        set.add("第一节课高数首发");
        set.add("欧耶");
        // 元素个数 size
        System.out.println(set.size());
        // 删除   remove,只能通过值来删除
        // System.out.println(set.remove("今天是个开心的早八"));
        System.out.println(set);
        // 是否包含某元素  contains
        System.out.println(set.contains("今天是个开心的早八"));
        // 清空   clear
        // set.clear();
        // 判断集合否为空。本质是判断 size 元素
        // System.out.println(set.isEmpty());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
