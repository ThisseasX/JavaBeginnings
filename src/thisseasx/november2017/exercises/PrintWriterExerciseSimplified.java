package thisseasx.november2017.exercises;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class PrintWriterExerciseSimplified {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("c://my_file.txt", "UTF-8");

        writer.println(input("name"));
        writer.println(input("surname"));
        writer.println(input("age"));
        writer.println(input("favorite color"));

        writer.close();
    }

    private static String input(String question) {
        System.out.println("Please input your " + question);
        return "My " + question + " is: " + scanner.nextLine();
    }
}
