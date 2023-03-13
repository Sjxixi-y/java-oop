package com.itsjxixi.exception.main;

import java.util.Scanner;

/**
 * 控制台输入两个整数，求商，输出
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int a = sc.nextInt();
        System.out.println("请叔输入除数");
        int b = sc.nextInt();
        System.out.println("结果：" + (a / b));

    }
}
