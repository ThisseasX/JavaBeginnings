package thisseasx.november2017.exercises;

import java.util.Scanner;

public class Rectangle {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";

    private static final Scanner SCANNER = new Scanner(System.in);

    private float length;
    private float width;

    public Rectangle() {
        this(input(0), input(1));
    }

    public Rectangle(float length, float width) {
        setLength(length);
        setWidth(width);
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = getNumberWithinBounds(length);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = getNumberWithinBounds(width);
    }

    public float getPerimeter() {
        return 2 * (width + length);
    }

    public float getArea() {
        return width * length;
    }

    public void printAll() {
        System.out.printf("The Rectangle's Length is: %s%s%s\n", ANSI_CYAN, getLength(), ANSI_RESET);
        System.out.printf("The Rectangle's Width is: %s%s%s\n", ANSI_CYAN, getWidth(), ANSI_RESET);
        System.out.printf("The Rectangle's Perimeter is: %s%s%s\n", ANSI_CYAN, getPerimeter(), ANSI_RESET);
        System.out.printf("The Rectangle's Area is: %s%s%s\n\n", ANSI_CYAN, getArea(), ANSI_RESET);
    }

    private static float input(int flag) {
        float f;
        String field = flag == 0 ? "Length" : "Width";
        do {
            System.out.println("Please input a number for " + field);
            while (!SCANNER.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                SCANNER.next();
            }
            f = SCANNER.nextFloat();
            if (f > 1 && f <= 20)
                break;
            System.out.println(field + " cannot be below 1 or over 20.");
        } while (true);
        return f;
    }

    private static float getNumberWithinBounds(float f) {
        if (f > 20) f = 20;
        else if (f <= 0) f = 1;
        return f;
    }
}
