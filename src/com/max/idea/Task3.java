package com.max.idea;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 5, 6};
        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
        System.out.println(array[0]+array[array.length-3]);
    }
}
