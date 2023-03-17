package com.itsjxixi.io.main;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        m();
    }

    public static void m() {
        FileInputStream fil = null;
        FileOutputStream fos = null;
        try {
            File file1 = new File("E:/A/1.txt");
            File file2 = new File("E:/A/baidu.txt");
            fil = new FileInputStream(file1);
            fos = new FileOutputStream(file2, true);
            byte[] b = new byte[fil.available()];
            int read = fil.read(b);
            while (read != -1) {
                fos.write(b);
                read = fil.read(b);
            }
            System.out.println("完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fil != null)
                        fil.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
