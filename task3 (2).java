package org.alg.practice8;

import java.util.Locale;
import java.util.Scanner;

public class task3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;

        System.out.println("Введите текст: ");
        string = scanner.nextLine();
        string = string.trim().toLowerCase();
        String[] words = string.split(" ");
        String longest = words[0];
        String shortest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.printf("longest: %s(%s)", longest,longest.length());
        System.out.println();
        System.out.printf("shortest: %s(%s)", shortest, shortest.length());
    }
}
