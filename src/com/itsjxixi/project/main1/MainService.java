package com.itsjxixi.project.main1;

import com.itsjxixi.project.main1.entity.Product;

import java.util.Map;

public class MainService {
    private static final MainDao m1 = new MainDao();

    // 判断商品ID是否正确
    public boolean yAndN(int a) {
        if (a <= 0) {
            return false;
        }
        return m1.indexOf(a);
    }

    // 添加商品
    public int addProduct(Product p1) {
        if (p1 == null) {
            return -1;
        }

        if (!m1.indexOf(p1.getID())) {
            return -1;
        }

        m1.addProduct(p1);
        return 1;
    }

    // 添加商品数量
    public int addProductNumber(int a) {
        if (!yAndN(a)) {
            return 404;
        }
        m1.addProductNumber(a);
        return 1;
    }

    // 删除商品
    public int delProduct(int a) {
        if (!yAndN(a)) {
            return -1;
        }
        m1.delProduct(a);
        return 1;
    }

    // 减少商品数量
    public int delProductNumber(int a) {
        // 判断商品是否合格
        if (!yAndN(a)) {
            return -1;
        }
        // 判断商品数量是否为0，为0直接删除
        if (0 == m1.nub(a)) {
            delProduct(a);
            return 1;
        }

        m1.addProductNumber(a);
        return 1;
    }

    // 输出
    public Map<Integer, Product> all() {
        return m1.all();
    }

    // 获取商品数量
    public int lenth() {
        return m1.length();
    }
}
