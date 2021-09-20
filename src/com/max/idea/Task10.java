package com.max.idea;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите высоту матрицы: ");
        int height = in.nextInt();
        System.out.print("Введите ширину матрицы: ");
        int width = in.nextInt();

        int[][] matrix = new int[height][width];
        System.out.println("Введите элементы матрицы: ");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] * 3 + "\t");
            }
            System.out.println();
        }

    }
}
