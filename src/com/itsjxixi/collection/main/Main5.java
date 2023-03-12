package com.itsjxixi.collection.main;

import java.util.LinkedList;

/**
 * 新增方法
 */
public class Main5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("jack");
        list.add("rose");
        list.add("cxk");
        list.add("李雷");
        list.add("韩梅梅");
        list.add("小白");
        System.out.println(list);
        // 头部添加
        list.addFirst("尼古拉斯");
        // 尾部添加
        list.addLast("亚洲舞王");

        System.out.println(list);

        // 删除头文件
        // list.removeFirst();
        // 删除尾部文件
        // list.removeLast();
        System.out.println(list);

        // 获取头部文件
        System.out.println(list.getFirst());
        // 获取尾部文件
        System.out.println(list.getLast());
    }
}
