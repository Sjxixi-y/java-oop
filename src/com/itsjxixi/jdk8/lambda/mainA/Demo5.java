package com.itsjxixi.jdk8.lambda.mainA;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class Demo5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> new Random().nextInt(100);

        int[] arr = getArr(s, 10);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] getArr(Supplier<Integer> s, int index) {
        int[] arr = new int[index];
        for (int i = 0; i < index; i++) {
            arr[i] = s.get();
        }
        return arr;
    }
}
