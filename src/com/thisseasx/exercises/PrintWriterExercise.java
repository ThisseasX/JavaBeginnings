package com.thisseasx.exercises;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class PrintWriterExercise {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("c://my_file.txt", "UTF-8");
        for (int i = 0; i < 4; i++) {
            writer.println(input(i));
        }
        writer.close();
    }

    private static String input(int flag) {
        String[] questions = {
                "name",
                "surname",
                "age",
                "favorite color"
        };
        System.out.printf("Please input your %s:\n", questions[flag]);
        return String.format("My %s is: %s", questions[flag], scanner.nextLine());
    }
}
