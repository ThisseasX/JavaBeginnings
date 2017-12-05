package thisseasx.december2017.experiments.ListTest;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> ints = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }

        System.out.println("Size " + ints.size());
        System.out.println("Removed " + ints.get(4));
        ints.remove(4);
        System.out.println("Added 999 in its place");
        ints.add(4, 999);

        for (Integer i : ints) {
            System.out.println(i);
        }
    }
}
