package com.itsjxixi.io.main;

import java.io.*;

/**
 * BufferedInputStream
 * BufferedOutputStream
 */
public class Main5 {
    public static void main(String[] args) {
        m();
    }

    public static void m() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("E:/A/1.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("E:/A/3.txt"));

            byte[] b = new byte[1024];
            int i = bis.read(b);

            while (i != -1) {
                bos.write(b, 0, i);
                i = bis.read(b);
            }
            System.out.println("OK");
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bis != null)
                        bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
