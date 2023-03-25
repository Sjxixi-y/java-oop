package com.s1w4;

import java.util.ArrayList;
import java.util.List;

class Demo04 {

    int count = 0;

    void m(){
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public static void main(String[] args) {
        Demo04 d = new Demo04();
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Thread(d::m,"thread---"+i));
        }
        list.forEach(Thread::start);

        list.forEach(o -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(d.count);
    }
}
