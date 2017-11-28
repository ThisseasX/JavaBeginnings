package com.thisseasx.november2017.experiments;

import java.util.Scanner;

public class InputTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        humanYears(input());
    }

    private static int input() {
        int i;
        do {
            System.out.println("Please input your dog's age:");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
            i = scanner.nextInt();
            if (i > 1 && i <= 30)
                break;
            System.out.println("Dog's age cannot be below 1 or over 30.");
        } while (true);
        return i;
    }

    private static void humanYears(int dogYears) {
        int humanYears;
        if (dogYears <= 2) humanYears = dogYears;
        else humanYears = (dogYears - 2) * 5 + 2;
        System.out.printf("%s dog years is equivalent to %s human years.\n", dogYears, humanYears);
    }
}
