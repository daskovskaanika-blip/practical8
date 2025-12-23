package org.alg.practice8;

import java.util.Scanner;

public class task5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        String[] badWords = {"тупой", "негр", "нигга", "даун", "аутист"};
        String censor = "****";

        System.out.println("Введите текст для цензуры: ");
        string = scanner.nextLine();

        for (String word: badWords) {
            string = string.replaceAll(word, censor);
        }
        System.out.println(string);
    }
}
