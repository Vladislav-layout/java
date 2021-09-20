package com.max.idea;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами: ");
        String str = in.nextLine();
        Pattern p = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher m = p.matcher(str);
        int count = 0;
        System.out.print("Слова на латинице: ");

        while (m.find()) {
            System.out.print(m.group() + " ");
            count++;
        }
        System.out.println("\nСлов на латинице: " + count);
    }
}
