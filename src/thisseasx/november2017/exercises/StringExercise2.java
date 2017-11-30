package thisseasx.november2017.exercises;

import java.util.Scanner;

public class StringExercise2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String string = "Good morning, good evening, and goodnight!";
        char search = input();
        int chars = countChars(string, search);

        System.out.println(chars);
    }

    private static int countChars(String s, char c) {
        int chars = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) chars++;
        }

        return chars;
    }

    private static char input() {
        System.out.println("Please input the char you want to search: ");
        return scanner.next().charAt(0);
    }
}
