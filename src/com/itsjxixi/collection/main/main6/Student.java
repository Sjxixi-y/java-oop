package com.itsjxixi.collection.main.main6;

import java.util.Objects;

/**
 * Student（id,name,age,score）
 */
public class Student implements Comparable<Student>{
    // 学生编号
    private int ID;
    // 姓名
    private String name;
    // 年龄
    private int age;
    // 分数
    private int score;

    public Student() {
    }

    public Student(int ID, String name, int age, int score) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    // 比较器
    @Override
    public int compareTo(Student o) {
        return this.getID() - o.getID();
    }
}
