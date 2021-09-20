package com.max.idea;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a: ");
        String a = in.nextLine();
        System.out.println("Введите b: ");
        int b = in.nextInt();
        int a_int = Integer.parseInt(a);
        if (a_int > b){
            System.out.println("Большее число: " + a + ", меньшее число: " + (double) b);
        } else System.out.println("Большее число: " + b + ", меньшее число: " + (double) a_int);
    }
}
