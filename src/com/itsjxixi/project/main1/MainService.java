package com.itsjxixi.project.main1;

import com.itsjxixi.project.main1.entity.Product;

public class MainService {
    private static final MainDao m1 = new MainDao();

    // 添加商品
    public int addProduct(Product p1) {
        if (p1 == null) {
            return -1;
        }

        if (m1.indexOf(p1.getID())) {
            return -1;
        }

        m1.addProduct(p1);
        return 1;
    }

    public int addProductNumber(int i) {
        if (i <= 0) {
            return -1;
        }

        m1.addProductNumber(i);
        return 1;
    }

    // // 删除商品
    // public int delProduct(int a) {
    //     if (i <= 0) {
    //         return -1;
    //     }
    //     m1.delProduct(a);
    // }

    // 减少商品数量
    // public int delProductNumber(int a) {
    //     // 判断商品数量是否为0，为0直接删除
    //     if (1 > ) {
    //         delProduct(a);
    //         return 1;
    //     }
    //
    //     return 1;
    // }
}
