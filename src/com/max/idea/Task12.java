package com.max.idea;
import java.util.Locale;

public class Task12 {
    public static void main(String[] args) {
    String text = new String("I like Java!!!");
        boolean java = text.contains("Java");
        boolean start = text.startsWith("I like");
        boolean end = text.endsWith("!!!");
        if (java && start && end) {
            System.out.println(text.toUpperCase(Locale.ROOT));
            System.out.println(text.substring(7,11).replace('a',  'o'));
        }
    }
}
