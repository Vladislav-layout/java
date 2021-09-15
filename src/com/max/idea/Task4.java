package com.max.idea;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число Х: ");
        double x = in.nextDouble();

        System.out.print("Введите число Y: ");
        double y = in.nextDouble();

        System.out.print("Введите число Z: ");
        double z = in.nextDouble();

        double sr=(x+y+z)/3;
        System.out.println("Среднее арифметическое: " + sr);

        if (Math.floor(sr/2)>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
