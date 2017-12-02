package thisseasx.november2017.examples.Independent;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ScannerSolution {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println("Hello " + name);
        System.out.println("What is your surname?");
        String surname = stdin.nextLine();
        System.out.println("What's your favorite color?");
        String color = stdin.nextLine();
        System.out.println("How old are you?");
        int age = stdin.nextInt();
        stdin.close();
        System.out.println("printing.........");

        try {
            PrintWriter writer = new PrintWriter("thefile.txt", "UTF-8");
            writer.println("My name is " + name);
            writer.println("My surname is " + surname);
            writer.println("My favorite color is " + color);
            writer.println("My age is " + age);
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
