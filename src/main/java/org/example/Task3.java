package org.example;

import java.util.Arrays;

public class Task3 extends Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        if (arr.length == 0) {
            System.out.println("Нет трат за месяц ");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Средняя трата за месяц - " + sum/arr.length);

    }
}
