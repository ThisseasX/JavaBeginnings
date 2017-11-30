package thisseasx.november2017.exercises;

public class ArrayLoopExercise4 {

    public static void main(String[] args) {
        int arrayIntegers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        boolean reverse = false;
        int size = arrayIntegers.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (!reverse) {
                System.out.println(arrayIntegers[i]);
                if (arrayIntegers[i] > max) max = arrayIntegers[i];
                if (arrayIntegers[i] < min) min = arrayIntegers[i];
            } else {
                System.out.println(arrayIntegers[size - 1 - i]);
                if (i == arrayIntegers.length - 1) break;
            }
            if (i == arrayIntegers.length - 1) {
                reverse = true;
                i = 0;
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}