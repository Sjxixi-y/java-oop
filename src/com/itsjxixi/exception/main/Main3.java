package com.itsjxixi.exception.main;

import java.util.Scanner;

/**
 * 控制台输入两个整数，求商，输出
 *
 * 添加 try - catch 捕获异常。
 */
public class Main3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        try {
            System.out.print("请输入被除数:");
            num1 = in.nextInt();
            System.out.print("请输入除数:");
            num2 = in.nextInt();
            System.out.println(num1 / num2);
        } catch (Exception e) {
            System.out.println("数据输入有误");
        }

        System.out.println("感谢使用本程序！");
        System.out.println("程序运行结束");
    }
}
