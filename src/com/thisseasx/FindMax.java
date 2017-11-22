package com.thisseasx;

public class FindMax {
    private static int[] ints = {5, 2, 6, 1, 8, 4};

    private static int returnMax(int[] ints) {
        int max = 0;
        for (int i : ints) {
            if (i > max) max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(returnMax(ints));
    }
}
