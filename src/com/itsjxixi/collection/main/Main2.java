package com.itsjxixi.collection.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  迭代器
 */
public class Main2 {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        arr.add("静态是个好日子");
        arr.add("极限的事儿都能成");
        arr.add("今天是个开心的早八");
        // 创建 迭代器 对象
        Iterator<String> it = arr.iterator();
        // 调用 hasNext() 方法判断是否还有下一个元素
        while (it.hasNext()) {
            // 调用 next() 方法获当前元素。随后指针下移动，
            System.out.println(it.next());
            it.remove();
        }
        // 迭代器已经使用过一次了，所以始终为false
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 为 0
        System.out.println(arr.size());
    }
}
