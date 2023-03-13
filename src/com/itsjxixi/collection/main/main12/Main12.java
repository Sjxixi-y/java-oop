package com.itsjxixi.collection.main.main12;

import java.util.*;

/**
 * 1、功能：每个单位要进行员工编号，编号规则为：首字母为A，
 * 后面为6位数字，按照自然数顺序依次排列，不够的补0，请为前1000名员工生成这些编号。
 */
public class Main12 {
    public static void main(String[] args) {
        List<Emp> set = new ArrayList<Emp>();
        String str = "0123456789";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; ++i) {
            if (i < 10) {
                set.add(new Emp("A" + "00000" + i));
            } else if (i < 100) {
                set.add(new Emp("A" + "0000" + i));
            } else if (i < 1000) {
                set.add(new Emp("A" + "000" + i));
            } else if (i < 10000) {
                set.add(new Emp("A" + "00" + i));
            } else if (i < 100000) {
                set.add(new Emp("A" + "0" + i));
            } else if (i < 1000000) {
                set.add(new Emp("A" + i));
            }
        }

        set.sort(new Comparator<Emp>(){
            @Override
            public int compare(Emp o1, Emp o2) {
                return Integer.parseInt(o1.getID().substring(1, o1.getID().length() - 1)) -
                        Integer.parseInt(o2.getID().substring(1, o2.getID().length() - 1));
            }
        });

        for (Emp e : set) {
            System.out.println(e);
        }
    }
}