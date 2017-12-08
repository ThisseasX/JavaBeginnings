package thisseasx.december2017.experiments.SetTest;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {

        Random r = new Random();

        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int y = r.nextInt(100);
            ints.add(y);
            ints.add(y);
        }

        for (Integer i : ints) {
            System.out.println(i);
        }

        System.out.println();

        Set<Integer> set = new HashSet<>(ints); // Elements are in the order they were inserted.

        for (Integer i : set) {
            System.out.println(i);
        }

        System.out.println();

        Set<Integer> set2 = new TreeSet<>(ints); // Elements are sorted.

        for (Integer i : set2) {
            System.out.println(i);
        }
    }
}
