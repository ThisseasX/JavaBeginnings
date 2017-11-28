package com.thisseasx.november2017.exercises;

public class StringExercise {

    public static void main(String[] args) {
        String string = "Good morning, good evening, and goodnight!";
        char search = ' ';
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
}
