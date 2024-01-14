package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2 extends Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        getSallaryMinAndMax(arr);
    }


    private static void getSallaryMinAndMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Вы не совершали трат!");
            return;
        }
        int maxSpending = 0;
        int minSpending = 300_000;
        for (int i = 0; i < arr.length; i++) {
            if (maxSpending < arr[i]) {
                maxSpending = arr[i];
            }
            if (minSpending > arr[i]) {
                minSpending = arr[i];
            }

        }
        System.out.println(maxSpending);
        System.out.println(minSpending);
    }

}
