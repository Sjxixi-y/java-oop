package com.itsjxixi.collection.main.main11;

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

    // 重写前：5，重写后：3
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID;
    }
    // 有可能会出现相同学生对象，不同 hash 值的情况，所以，需要更改计算方式。
    @Override
    public int hashCode() {
        return Objects.hash(ID, name, age, score);
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

    @Override
    public int compareTo(Student o) {
        return this.ID - o.ID;
    }
}
