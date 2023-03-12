package com.itsjxixi.collection.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Collections工具类
 */
public class Main15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        // 批量添加元素
        Collections.addAll(list, 1, 2, 1, 2, 21, 32, 456, 4, 64, 1, 3);
        System.out.println(list);
        // 排序
        Collections.sort(list);
        System.out.println(list);
        // 二分查找
        System.out.println(Collections.binarySearch(list, 1));
        // 复制
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        // 需要有足够的长度。
        // Collections.copy(list2, list);
        System.out.println(list2);
        // 全部替换
        // Collections.fill(list, 1);
        // System.out.println(list);
        // 最大值
        System.out.println(Collections.max(list));
        // 最小值
        System.out.println(Collections.min(list));
        // 转化线程安全
        List<Integer> list1 = Collections.synchronizedList(list);

    }
}
