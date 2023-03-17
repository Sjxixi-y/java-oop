package com.itsjxixi.project.main1;

import com.itsjxixi.project.main1.entity.Product;

import java.util.Map;
import java.util.Set;

public class View {
    // 主页
    public void m() {
        System.out.println("============== 购物车 ===============");
        System.out.println("============ 1.添加商品 =============");
        System.out.println("============ 2.删除商品 =============");
        System.out.println("============ 3.商品加一 =============");
        System.out.println("============ 4.商品减一 =============");
        System.out.println("============ 5.输出全部 =============");
        System.out.println("============ 6.退出购物 =============");
    }
    // 添加
    public void mA() {
        System.out.println("============== 添加商品 ==============");
        System.out.println("输入详细商品信息(0返回，1开始输入)：");
    }
    // 删除
    public void mB() {
        System.out.println("============== 删除商品 ==============");
        System.out.println("输入商品编号(按0返回)：");
    }
    // 添加商品数量
    public void mC() {
        System.out.println("============== 商品加一 ==============");
        System.out.println("输入商品编号(按0返回)：");
    }
    // 减少商品数量
    public void mD() {
        System.out.println("============== 商品减一 ==============");
        System.out.println("输入商品编号(按0返回)：");
    }
    // 输出
    public void mE(Map<Integer, Product> map) {
        Set<Map.Entry<Integer, Product>> set = map.entrySet();
        for (Map.Entry<Integer, Product> integerProductEntry : set) {
            System.out.println(integerProductEntry);
        }
    }

}
