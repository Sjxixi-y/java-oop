package com.itsjxixi.process.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时钟效果
 */
public class Main7 {
    public static void main(String[] args) {

        // DateFormat sdf = new SimpleDateFormat("hh:mm:ss");

        while(true){

            Date now = new Date();
            // String strdate = sdf.format(now);

            // System.out.print(strdate);
            System.out.print(now.toLocaleString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print('\r');
        }

    }
}
