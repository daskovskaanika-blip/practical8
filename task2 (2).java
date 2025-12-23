package org.alg.practice8;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        String[] words;
        String[] reversed_words;

        System.out.println("Введите строку для переворота: ");
        text = scanner.nextLine();
        words = text.split(" ");
        reversed_words = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            reversed_words[i] = new String("");
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversed_words[i] += words[i].charAt(j);
            }
        }
        System.out.println("Перевёрнутый текст: " + Arrays.toString(reversed_words));
    }
}
