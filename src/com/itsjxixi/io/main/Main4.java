package com.itsjxixi.io.main;

import java.io.*;

/**
 * FileReader 输入
 * FileWriter 输出
 */
public class Main4 {
    public static void main(String[] args) {
        m();
    }

    public static void m() {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("E:/A/1.txt");
            fw = new FileWriter("E:/A/2.txt");

            char[] c = new char[1024];

            int i = fr.read(c);
            while (i != -1) {
                fw.write(c);
                i = fr.read(c);
            }
            fw.flush();
            System.out.println("OK");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fr != null)
                        fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
