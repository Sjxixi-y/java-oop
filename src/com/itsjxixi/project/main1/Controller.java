package com.itsjxixi.project.main1;

import com.itsjxixi.project.main1.entity.Product;

import java.util.Scanner;

public class Controller {
    private View v = new View();
    private MainService m = new MainService();
    private Scanner sc = new Scanner(System.in);

    // 主页
    public void A() {
        while (true) {
            v.m();
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    B();
                    break;
                case 2:
                    D();
                    break;
                case 3:
                    C();
                    break;
                case 4:
                    E();
                    break;
                case 5:
                    G();
                    break;
                default:
                    F();
                    return;
            }
        }
    }

    // 添加商品
    public void B() {
        v.mA();
        int s = sc.nextInt();
        if (0 == s) {
            return;
        }
        // 名字
        System.out.print("名字：");
        String s1 = sc.nextLine();
        // 价格
        System.out.print("价格：");
        int i = sc.nextInt();
        // 商品数量
        System.out.print("商品数量：");
        int i1 = sc.nextInt();
        System.out.println(m.addProduct(new Product(m.lenth(), s1, i, i1)));
    }

    // 添加商品数量
    public void C() {
        v.mC();
        int s = sc.nextInt();
        if (0 == s) {
            return;
        }
        System.out.println(m.addProductNumber(s));
    }

    // 删除物品
    public void D() {
        v.mB();
        int s = sc.nextInt();
        if (0 == s) {
            return;
        }
        System.out.println(m.delProduct(s));
    }

    // 减少商品数量
    public void E() {
        v.mD();
        int s = sc.nextInt();
        if (0 == s) {
            return;
        }
        System.out.println(m.delProductNumber(s));
    }

    // 输出
    public void G() {
        v.mE(m.all());
    }

    public void F() {
        System.out.print("关闭中。");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print('\r');
        System.out.print("关闭中。。");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print('\r');
        System.out.print("关闭中。。。");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print('\r');
    }

    public static void main(String[] args) {
        Controller c = new Controller();
        c.A();
    }
}
