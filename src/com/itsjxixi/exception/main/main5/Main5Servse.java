package com.itsjxixi.exception.main.main5;

import java.util.Scanner;

public class Main5Servse {

    public void chu() throws Main5Exception {

        Main5MySQL my = new Main5MySQL();

        try {
            Scanner sc = new Scanner(System.in);
            my.dao(sc.nextLine());
            System.out.println("Servse");
        } catch (NumberFormatException e) {
            System.out.println("程序员看到的：" + e.getMessage());
            throw new Main5Exception("必须是数字");
        }
    }
}
