package com.thisseasx.november2017.exercises;

public class SwitchExercise {

    public static void main(String[] args) {

        int[] ints = {7, 10, 444, 99};

        for (int i : ints) {
            switch (i) {
                case 7:
                    System.out.println("Hello!");
                    break;
                case 10:
                    System.out.println("Hi");
                    break;
                case 444:
                    System.out.println("Good");
                    break;
                default:
                    System.out.println("No Match Found");
            }
        }
    }
}
