package com.max.idea;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Final_task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Текущий курс доллара: ");
        double rate = in.nextDouble();
        System.out.print("Количество рублей: ");
        double count = in.nextDouble();
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.print("Итого: " + f.format(count/rate) + " долларов");
    }
}
