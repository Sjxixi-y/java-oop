package com.itsjxixi.exception.main.main4;

public class Person {
    private String naem;
    private String id;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String naem, String id, int age, String sex) {
        this.naem = naem;
        this.id = id;
        this.age = age;
        this.sex = sex;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "naem='" + naem + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
