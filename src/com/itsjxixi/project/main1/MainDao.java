package com.itsjxixi.project.main1;

import com.itsjxixi.project.main1.entity.Product;

import java.util.*;

/**
 * 增删改查
 */
public class MainDao {
    private static final Map<Integer, Product> arr = new HashMap<Integer, Product>();

    static {
        arr.put(1, new Product(1, "汽车", 10000, 0));
        arr.put(2, new Product(2, "手机", 2000, 0));
        arr.put(3, new Product(3, "电脑", 5000, 0));
        arr.put(4, new Product(4, "飞机", 10000, 0));
    }

    // 增加商品类型
    public void addProduct(Product p1) {
        arr.put(p1.getID(), p1);
    }

    // 添加商品数量
    public void addProductNumber(int a) {
        arr.get(a).setNumber(arr.get(a).getNumber() + 1);
    }

    // 删除商品
    public void delProduct(int a) {
        arr.remove(a);
    }

    // 减少商品数量
    public int delProductNumber(int a) {
        // 判断商品数量是否为0，为0直接删除
        if (1 > arr.get(a).getNumber()) {
            delProduct(a);
            return 1;
        }

        arr.get(a).setNumber(arr.get(a).getNumber() - 1);
        return 1;
    }

    // 查询单个
    public boolean indexOf(int a) {
        return arr.containsKey(a);
    }

    // 查询全部
    public Map<Integer, Product> all() {
        return arr;
    }

    // 查询商品种类
    public int length() {
        return arr.size();
    }

    // 获取商品数量
    public int nub(int a) {
        return arr.get(a).getNumber();
    }
}
