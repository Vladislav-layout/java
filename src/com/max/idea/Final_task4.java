package com.max.idea;

import java.util.Locale;
import java.util.Scanner;

public class Final_task4 {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        Scanner in = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {
            System.out.println("Введите ответ: ");
            String answer = in.nextLine().toLowerCase(Locale.ROOT);
            if (i == 1 && answer.equals("подсказка")){
                System.out.println("virus.zip");
                i = 2;
                continue;
            }
            if ((i == 2 || i == 3) && answer.equals("подсказка")){
                System.out.println("Подсказка уже недоступна.");
                i--;
                continue;
            }
            if (answer.equals("заархивированный вирус")) {
                System.out.println("Правильно!");
                System. exit(0);
            } else if (i == 1 || i == 2) {
                System.out.println("Подумай еще!");
            }
        }
        System.out.println("Обидно, приходи в другой раз");
    }
}
