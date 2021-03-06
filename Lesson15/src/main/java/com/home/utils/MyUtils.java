package com.home.utils;

import lombok.experimental.UtilityClass;

import java.util.Scanner;

@UtilityClass
public class MyUtils {
    public static int readIntFromConsole(String message, int bound) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println(message + ":");
            while (!scanner.hasNextDouble()) {
                System.out.println("Введенное не является числом.");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (isNotInBounds(number, bound));
        return number;
    }

    public static String readStringFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    private static boolean isNotInBounds(int number, int bound) {
        if (number < 1 || number > bound) {
            System.out.println("Введенное не является положительным числом.");
        }
        return number < 1 || number > bound;
    }
}
