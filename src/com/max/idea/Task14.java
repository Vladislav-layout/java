package com.max.idea;


import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (40 + 1) - 20);
        }

        int max = array[0];
        int min = array[0];

        for (int j : array) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));

        System.out.println("Максимальный элемент: " + max + "\nМинимальный элемент :" + min);
        if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Наибольший по модулю: |" + Math.abs(max) + "|");
        } else if (Math.abs(max) == Math.abs(min)) {
            System.out.println("Равны по модулю: |" + max + "|");
        } else {
            System.out.println("Наибольший по модулю: |" + Math.abs(min) + "|");
        }
    }
}
