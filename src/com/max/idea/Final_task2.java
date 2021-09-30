package com.max.idea;
import java.util.Locale;
import java.util.Scanner;


public class Final_task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String equation = in.nextLine();
        char[] char_array = equation.toLowerCase(Locale.ROOT).toCharArray();
        int find_x =0;
        int x = equation.toLowerCase(Locale.ROOT).indexOf('x');
        int a;
        int b;
        int result = 0;
        char sign = equation.charAt(1);
        for (char character : char_array) {
            if (character == 'x') {
                find_x++;
            }
        }
        if (equation.length() > 5 || equation.charAt(3) != '=' || find_x != 1 || (sign != '-' & sign != '+')) {
            System.out.println("Некорректный ввод данных");
        } else {
            if (sign == '-' && x == 0) {
                a = Character.getNumericValue(equation.charAt(2));
                b = Character.getNumericValue(equation.charAt(4));
                result = a + b;
            } else if (sign == '-' && x == 2) {
                a = Character.getNumericValue(equation.charAt(0));
                b = Character.getNumericValue(equation.charAt(4));
                result = a - b;
            } else if (sign == '-' && x == 4) {
                a = Character.getNumericValue(equation.charAt(0));
                b = Character.getNumericValue(equation.charAt(2));
                result = a - b;
            } else if (sign == '+' && x == 0) {
                a = Character.getNumericValue(equation.charAt(2));
                b = Character.getNumericValue(equation.charAt(4));
                result = b - a;
            } else if (sign == '+' && x == 2) {
                a = Character.getNumericValue(equation.charAt(0));
                b = Character.getNumericValue(equation.charAt(4));
                result = b - a;
            } else if (sign == '+' && x == 4) {
                a = Character.getNumericValue(equation.charAt(0));
                b = Character.getNumericValue(equation.charAt(2));
                result = a + b;
            }

            System.out.println("Х = " + result);

        }
    }
}