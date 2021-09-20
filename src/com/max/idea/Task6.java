package com.max.idea;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = in.nextInt();
        if (x == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int y = in.nextInt();
            System.out.println("Введите число");
            int z = in.nextInt();

            switch (y) {
                case 1:
                    System.out.println("Результат:\n Метры: " + z + "\n Мили: " + z / 1609.34 + "\n Ярды: " + z * 1.09361 + "\n Футы: " + z * 3.28084);
                    break;
                case 2:
                    System.out.println("Рез:\n Метры: " + z * 1609.34 + "\n Мили: " + z + "\n Ярды: " + z * 1760.003 + "\n Футы: " + z * 5280.010);
                    break;
                case 3:
                    System.out.println("Результат:\n Метры: " + z * 0.9144 + "\n Мили: " + z * 0.000568 + "\n Ярды: " + z + "\n Футы: " + z * 3);
                    break;
                case 4:
                    System.out.println("Результат:\n Метры: " + z * 0.3048 + "\n Мили: " + z * 0.000189 + "\n Ярды: " + z * 0.333 + "\n Футы: " + z);
                    break;
                default:
                    System.out.println("Выбрана некорректная цифра единицы измерения");
            }
        } else if (x == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - тонна, 3 - фунт, 4 - унция");
            int y = in.nextInt();
            System.out.println("Введите число");
            double z = in.nextDouble();

            switch (y) {
                case 1:
                    System.out.println("Результат:\n Килограммы: " + z + "\n Тонны: " + z / 1000 + "\n Фунты: " + z * 2.204 + "\n Унции: " + z * 35.273);
                    break;
                case 2:
                    System.out.println("Рез:\n Килограммы: " + z * 1000 + "\n Тонны: " + z + "\n Фунты: " + z * 2204.622 + "\n Унции: " + z * 35273.961);
                    break;
                case 3:
                    System.out.println("Результат:\n Килограммы: " + z * 0.453 + "\n Тонны: " + z * 0.000453 + "\n Фунты: " + z + "\n Унции: " + z * 16);
                    break;
                case 4:
                    System.out.println("Результат:\n Килограммы: " + z * 0.0283 + "\n Тонны: " + z * 2.8349523125E-5 + "\n Фунты: " + z * 0.06249 + "\n Унции: " + z);
                    break;
                default:
                    System.out.println("Выбрана некорректная цифра единицы измерения");
            }
        }
        else {System.out.println("Введен некорректный символ");}
    }
}