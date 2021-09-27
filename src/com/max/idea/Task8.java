package com.max.idea;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число n: ");
        int n = in.nextInt();
        while(n <= 0) {
                System.out.println("Вы ввели ноль или отрицательное число. Попробуйте еще раз!\nВведите целое положительное число n: ");
            n = in.nextInt();
        }

        int sum = 0;
        for(int i = 1; i <= n; i+=2){
            sum += i;
        }
        System.out.println("Сумма всех нечетных до n включительно: " + sum);
    }
}
