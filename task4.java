package org.alg.practice8;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = sc.nextLine();

        String result = "";
        boolean makeUpper = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '-' || c == '_') {
                makeUpper = true;
            } else {
                if (makeUpper && c >= 'a' && c <= 'z') {
                    c = (char)(c - 32);
                    makeUpper = false;
                }
                result += c;
            }
        }

        System.out.println(result);
    }
}

