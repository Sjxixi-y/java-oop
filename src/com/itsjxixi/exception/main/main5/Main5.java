package com.itsjxixi.exception.main.main5;

/**
 * 用户输入拍卖价格，系统将拍卖价格保存到数据库中，给出提示信息
 */
public class Main5 {
    public static void main(String[] args) {
        Main5Servse m = new Main5Servse();

        try {
            m.chu();
        } catch (Main5Exception e) {
            System.err.println("用户看到的信息：" + e.getMessage());
        }
    }
}
