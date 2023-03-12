package com.itsjxixi.collection.main.main11;

import java.util.TreeSet;

/**
 * 储存学生信息
 */
public class Main11 {
    public static void main(String[] args) {
        // 创建集合对象
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(3,"ccc",17,80));
        students.add(new Student(1,"aaa",17,98));
        students.add(new Student(2,"bbb",18,100));
        students.add(new Student(4,"aaa",17,98));
        students.add(new Student(1,"aaa",17,98));

        // 内部比较器规则：按照学号排序。
        for (Student stu:students) {
            System.out.println(stu);
        }
    }
}
