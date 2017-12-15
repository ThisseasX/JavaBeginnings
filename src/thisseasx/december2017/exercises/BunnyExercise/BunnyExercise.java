package thisseasx.december2017.exercises.BunnyExercise;

import java.util.*;

public class BunnyExercise {

    private static final Scanner sc = new Scanner(System.in);
    private static final int NUMBER_OF_BUNNIES = input();

    public static void main(String[] args) {
        Random r = new Random();

        List<Bunny> bunnies = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_BUNNIES; i++) {
            bunnies.add(new Bunny(r.nextInt(1000)));
        }

        System.out.println();

        for (int i = 0; i < bunnies.size(); i++) {
            bunnies.get(i).hop();
        }

        System.out.println("\nLooking for illegal bunnies...\n");

        int bunned = bunnies.get(r.nextInt(NUMBER_OF_BUNNIES)).getBunnyNumber();

        for (Iterator<Bunny> iter = bunnies.iterator(); iter.hasNext(); ) {
            Bunny b = iter.next();
            if (b.getBunnyNumber() == bunned) {
                iter.remove();
                System.out.printf("-- BUNNY #%s IS BUNNED FOR ABUSE --\n", bunned);
                continue;
            }
            b.hop();
        }

        System.out.println();

        for (Bunny bunny : bunnies) {
            bunny.hop();
        }

        System.out.println("\nHopping with method reference\n");
        bunnies.forEach(Bunny::hop);
    }

    private static int input() {
        int i;
        while (true) {
            System.out.println("Please input the number of bunnies you want to create: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
            }
            i = sc.nextInt();
            if (i > 0) break;
            System.out.println("The number must be positive");
        }
        return i;
    }
}
