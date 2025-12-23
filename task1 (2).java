package org.alg.practice8;

import java.util.Scanner;

public class task1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user_string;
        boolean polyndrom = true;

        System.out.println("Введите строку на проверку полиндрома");
        user_string = scanner.nextLine();
        String user_string_lower = user_string.trim().toLowerCase();

        for (int i = 0; i < user_string_lower.length(); i++) {
            int endindex = user_string_lower.length() - 1 - i;
            if (user_string_lower.charAt(i) != user_string_lower.charAt(endindex)) {
                polyndrom = false;
                break;
            }
        }
        if (polyndrom) {
            System.out.printf("Строка '%s' - полиндром", user_string);
        } else {
            System.out.printf("Строка '%s' - не полиндром", user_string);
        }
    }
}
