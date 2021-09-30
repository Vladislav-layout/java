package com.max.idea;
import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.Arrays;
import java.util.OptionalLong;
import java.util.Scanner;

public class Final_task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int count = in.nextInt();

        String[] array = new String[count];
        int num_line = 1;
        for (int i = 0; i < array.length; i++){
            System.out.println("Введите строку №" + num_line + ":");
            array[i] = str.nextLine();
            num_line++;
        }
        long [] unique_array = new long [count];
        for (int i = 0; i < array.length; i++) {
                unique_array[i] =  array[i].toLowerCase().chars().distinct().summaryStatistics().getCount();
        }
        long maxNumber = unique_array[0];
        int maxIndex = 0;
        for (int i = 0; i < unique_array.length; i++) {
            if(maxNumber < unique_array[i]){
                maxNumber = unique_array[i];
                maxIndex = i;
            }
        }
        System.out.println("Ответ: " + array[maxIndex]);

    }
}
