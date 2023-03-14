package com.itsjxixi.exception.main.main4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据");

        Person p1 = new Person();

        System.out.println("请输入姓名");
        p1.setNaem(sc.nextLine());

        System.out.println("请输入学号");
        p1.setId(sc.nextLine());

        System.out.println("请输入年龄");


    }
}
