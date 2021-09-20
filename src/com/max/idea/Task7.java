package com.max.idea;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int a = in.nextInt();
        int[] array = new int[a];
        System.out.println("Введите данные массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("Массив: [");
        for (int j : array) {
            System.out.print(j);
            a--;
            if (a != 0) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");

        for (int k : array) {
            if (k == x || k == y || k == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
