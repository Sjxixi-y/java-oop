package com.s1w4.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用递归实现将某个目录下所有内容copy到另一个目录中
 */
public class Demo1 {
    public static void main(String[] args) {
        // 复制文件地址
        File f1 = new File("E:/A");
        // 粘贴文件地址
        File f2 = new File("E:/B");
        a(f1, f2);
    }

    public static void a(File f1, File f2) {
        // 是文件，执行操作
        if (f1.isFile()) {
            // 获取黏贴文件的父目录
            File file = f2.getParentFile();
            boolean mkdirs = file.mkdirs();
            m(f1, f2);
            return;
        }

        // 不是文件， 继续递归
        // 获取当前目录的子文件夹
        File[] files = f1.listFiles();
        // 子文件夹为空
        if (files == null) {
            boolean mkdirs = f2.mkdirs();
            return;
        }
        // 子文件开始执行判断
        for (File file : files) {
            File file1 = new File(f2.getAbsolutePath() + "/" + file.getName());
            a(file, file1);
        }
    }

    public static void m(File file1, File file2) {
        FileInputStream fil = null;
        FileOutputStream fos = null;
        try {
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
