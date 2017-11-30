package thisseasx.november2017.exercises;

public class ArrayLoopExercise2 {

    public static void main(String[] args) {
        int[] numbers = {4, 6, 8, 3, 44, 23, 97, 16};
        int min = numbers[0];
        int max = numbers[0];

        StringBuilder array = new StringBuilder();
        StringBuilder arrayReversed = new StringBuilder();

        for (int i = 0, j = numbers.length - 1; i < numbers.length && j >= 0; i++, j--) {
            array.append(numbers[i]).append(" ");
            arrayReversed.append(numbers[j]).append(" ");
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }
        System.out.printf("List: %s\nListReversed: %s\nMin: %s\nMax: %s", array, arrayReversed, min, max);
    }
}
