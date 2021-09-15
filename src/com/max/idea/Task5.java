package com.max.idea;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите число Х: ");
        double x = in.nextInt();

        System.out.print("Введите число Y: ");
        double y = in.nextInt();

        System.out.print("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’: ");
        String simbol = in2.nextLine();

        switch (simbol) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            default:
                System.out.println("Введен неверный символ");
                break;
        }
    }
}
