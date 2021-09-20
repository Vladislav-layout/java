package com.max.idea;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int a = in.nextInt();
        Double[] array = new Double[a];
        double sr = 0;
        System.out.println("Введите данные массива: ");
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextDouble();
             sr += array[i];
        }
        sr /= a;
        System.out.print("Массив: [");
        for (int j = 0; j < array.length; j++) {
            System.out.printf("%.2f", array[j] * sr);
            a--;
            if(a != 0){
                System.out.print(";");
            }
        }
        System.out.print("]\n");
    }
}
