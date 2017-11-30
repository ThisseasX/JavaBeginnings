package thisseasx.november2017.exercises;

import java.util.ArrayList;
import java.util.List;

public class ArrayLoopExercise3 {

    public static void main(String[] args) {
        int[] numbers = {4, 6, 8, 3, 44, 23, 97, 16};
        int min = numbers[0];
        int max = numbers[0];

        List<Integer> list = new ArrayList<>();
        List<Integer> listReversed = new ArrayList<>();

        for (int i : numbers) {
            list.add(i);
            listReversed.add(0, i);
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.printf("List: %s\nListReversed: %s\nMin: %s\nMax: %s", list, listReversed, min, max);
    }
}
