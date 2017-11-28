package com.thisseasx.november2017.exercises;

public class Exercise {

    public static void main(String[] args) {
        int[] array = {7, 4, 7, 3, 9, 6};

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > max)
                max = array[i];
        }
        System.out.println();
        System.out.println(max);

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
            if (array[i] < min)
                min = array[i];
        }
        System.out.println();
        System.out.println(min);
    }
}
