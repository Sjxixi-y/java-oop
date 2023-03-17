package com.itsjxixi.io.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 输出流
 */
public class Main2 {
    public static void main(String[] args) {
        m();
    }

    public static void m() {

        FileOutputStream fos = null;
        try {
            String s = "afqafawfawfafqawefgaewfgqaefgqaefg";
            File file = new File("E:/A/baidu.txt");
            fos = new FileOutputStream(file);
            byte[] b = s.getBytes();
            fos.write(b);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
