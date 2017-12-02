package thisseasx.november2017.exercises.ArrayLoopExercise;

public class ArrayLoopExercise {

    public static void main(String[] args) {
        int[] numbers = {4, 6, 8, 3, 44, 23, 97, 16};
        int min = numbers[0];
        int max = numbers[0];

        System.out.print("My int array: ");
        for (int i : numbers) {
            System.out.print(i + " ");

            if (i < min) min = i;
            if (i > max) max = i;
        }

        System.out.print("\nMy int array reversed: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.printf("\nMin is %d, and Max is %d\n", min, max);
    }
}
