package com.itsjxixi.collection.main.main9;

import com.itsjxixi.collection.main.main11.Student;

import java.util.HashSet;
import java.util.Set;

/**
 *  储存学生
 */
public class Main9 {
    public static void main(String[] args) {
        //创建集合对象
        Set<Student> stuset = new HashSet<Student>();
        //存储学生多个
        stuset.add(new Student(3,"ccc",17,80));
        stuset.add(new Student(1,"aaa",17,98));
        stuset.add(new Student(2,"bbb",18,100));
        stuset.add(new Student(4,"aaa",17,98));
        stuset.add(new Student(1,"aaa",17,98));
        // 是 5 个， 没有发生覆盖现象，要Student重写方法。
        System.out.println(stuset.size());
        // 重写后 4 个， 判断条件是ID
        System.out.println(stuset.size());
    }
}
