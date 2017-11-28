package com.thisseasx.november2017.experiments;

public class VariableTest {

    public static void main(String[] args) {

        int x = 0;
        System.out.println(x++); // Increment occurs after being displayed. Prints 0.

        int y = 0;
        System.out.println(++y); // Increment occurs before being displayed. Prints 1.

        int i = 10;

        System.out.println(++i);
    }
}
