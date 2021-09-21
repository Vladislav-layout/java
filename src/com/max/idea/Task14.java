package com.max.idea;


public class Task14 {
    public static void main(String[] args) {
       int [] array = new int[15];
        int max = 0;
        int min = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*(40 + 1) - 20);
            if(min > array[i]){
                min = array[i];
            }
            if (max< array[i]){
                max = array[i];
            }
        }
        System.out.print("Массив: [");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            if(j != 14){
                System.out.print(";");
            }
        }
        System.out.print("]\n");
        System.out.println("Максимальный элемент: " + max + "\nМинимальный элемент :" + min);
        if (Math.abs(max) > Math.abs(min)){
            System.out.println("Наибольший по модулю: " + max + " = |" + Math.abs(max) + "|");
        }
        else if (Math.abs(max) == Math.abs(min)){
            System.out.println("Равны по модулю: |" + min + "| = |" + max + "|");
        }
        else {
            System.out.println("Наибольший по модулю: " + min + " = |" + Math.abs(min)+"|");
        }

    }
}
