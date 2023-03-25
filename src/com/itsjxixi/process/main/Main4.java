package com.itsjxixi.process.main;

/**
 * 查看修改优先级别
 */
public class Main4 {
    public static void main(String[] args) {
        // 获取默认优先级
        System.out.println(Thread.currentThread().getPriority());
        // 修改默认优先级
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
    }
}
