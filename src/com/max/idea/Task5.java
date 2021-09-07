package com.max.idea;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите число Х: ");
        int x = in.nextInt();

        System.out.print("Введите число Y: ");
        int y = in.nextInt();

        System.out.print("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’: ");
        char simbol = in.next().charAt(0);

        if(simbol=='+')System.out.println(x+y);else
        if(simbol=='-')System.out.println(x-y);else
        if(simbol=='/')System.out.println(x/y);else
        if(simbol=='*')System.out.println(x*y);else System.out.println("Введен неверный символ");

    }
}
