package com.itsjxixi.collection.main;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection接口方法
 */
public class Main1 {
    public static void main(String[] args) {
        Collection<String> cool = new ArrayList<String>();
        Collection<String> cool1 = new ArrayList<String>();
        // 添加操作 add
        cool.add("静态是个好日子");
        cool.add("极限的事儿都能成");
        cool1.add("今天是个开心的早八");
        cool1.add("AADD");
        // 元素个数 size
        System.out.println(cool.size());
        System.out.println(cool1.size());
        // 判断是否包含某个元素 contains
        System.out.println(cool.contains("静态是个好日子"));
        // 判断集合是否为空 isEmpty
        System.out.println(cool1.isEmpty());
        // 删除元素 remove
        System.out.println(cool.remove("静态是个好日子"));
        // 添加另一个集合  addAll
        cool.addAll(cool1);
        for (String str : cool) {
            System.out.println(str);
        }
        // 判断一个集合中是否包含另一个元素 containsAll
        System.out.println(cool.containsAll(cool1));

        // 从⼀个集合中移除另⼀个集合    removeAll
        System.out.println(cool.removeAll(cool1));
        for (String str : cool) {
            System.out.println(str);
        }
        System.out.println("----------------------------");
        // 清空集合中所有元素    clear
        // cool.clear();
        // for (String str : cool) {
        //     System.out.println(str);
        // }
        // 将集合转换成数组 toArray
        Object[] str =  cool1.toArray();
        for (Object o : str) {
            String str1 = (String) o;
            System.out.println(str1);
        }
    }
}

























