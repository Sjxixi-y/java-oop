package com.itsjxixi.exception.main;

import java.util.Scanner;

/**
 * 控制台输入两个整数，求商，输出
 * <p>
 * 输入时无法判断，程序容易出问题。
 * <p>
 * 对程序进行修改。
 * hasNextInt() --- 判断输入的数据是否为数字。
 * System.exit(1) --- 结束程序。
 */
public class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int num1 = 0;

        if (in.hasNextInt()) { // 如果输入的被除数是整数
            num1 = in.nextInt();
        } else { // 如果输入的被除数不是整数
            System.err.println("输入的被除数不是整数，程序退出。");
            System.exit(1); // 结束程序执行
        }

        System.out.print("请输入除数:");
        int num2 = 0;

        if (in.hasNextInt()) { // 如果输入的除数是整数
            num2 = in.nextInt();
            if (0 == num2) { // 如果输入的除数是0
                System.err.println("输入的除数是0，程序退出。");
                System.exit(1);
            }
        } else { // 如果输入的除数不是整数
            System.err.println("输入的除数不是整数，程序退出。");
            System.exit(1);
        }

        System.out.println(String.format("%d / %d = %d",
                num1, num2, num1 / num2));
        System.out.println("感谢使用本程序！");
        System.out.println("程序运行结束");
    }
}
