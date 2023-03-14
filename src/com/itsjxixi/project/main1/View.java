package com.itsjxixi.project.main1;

import java.util.Scanner;

public class View {
    private static Scanner sc = new Scanner(System.in);
    private static MainService sv = new MainService();

    public void m() {
        System.out.println("============== 购物车 ===============");
        System.out.println("============ 1.添加商品 =============");
        System.out.println("============ 2.删除商品 =============");
        System.out.println("============ 3.商品加一 =============");
        System.out.println("============ 4.商品减一 =============");
        System.out.println("============ 5.查询商品 =============");
        System.out.println("============ 5.查询所有商品 ==========");
        System.out.println();
    }

    public void mA() {
        System.out.println("============== 添加商品 ==============");
        System.out.println("输入详细商品信息(任意字母返回，0开始输入)：");
        System.out.println("编号");
        System.out.println("名字：");
        System.out.println("价格：");
        System.out.println("商品数量：");
    }

    public void mB() {
        System.out.println("============== 删除商品 ==============");
        System.out.println("输入商品编号(任意字母返回)：");
    }

    public void mC() {
        System.out.println("============== 商品加一 ==============");
        System.out.println("输入商品编号(任意字母返回)：");
    }

    public void mD() {
        System.out.println("============== 商品减一 ==============");
        System.out.println("输入商品编号(任意字母返回)：");
    }

    public void mE() {
        System.out.println("============== 商品减一 ==============");
        System.out.println("输入商品编号(任意字母返回)：");
    }
}
