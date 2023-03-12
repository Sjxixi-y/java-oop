package com.itsjxixi.collection.main.main6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 定义一个集合类，存储若干个学生对象（Student（id,name,age,score）），
 * 遍历输出，再排序，再遍历输出！
 */
public class Main6 {
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<>();
        stu.add(new Student(110, "A", 20, 80));
        stu.add(new Student(101, "B", 21, 77));
        stu.add(new Student(111, "C", 22, 88));
        stu.add(new Student(108, "D", 19, 90));
        stu.add(new Student(105, "E", 23, 60));

        for (Student st:stu) {
            System.out.println(st);
        }

        System.out.println("----------------------------");

        // 内部比较器
        // stu.sort(null);

        Comparator<Student> co = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getID() - o2.getID();
            }
        };
        // 外部比较器
        stu.sort(co);

        for (Student st:stu) {
            System.out.println(st);
        }
    }
}
