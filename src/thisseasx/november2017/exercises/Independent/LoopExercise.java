package thisseasx.november2017.exercises.Independent;

public class LoopExercise {
    public static void main(String[] args) {

        int i = 0;

        for (int j = 1; j <= 10; j++) {
            switch (j) {
                case 3:
                case 4:
                case 5:
                    System.out.println("Skipped " + j);
                    continue;
                default:
                    System.out.println("Added " + j);
            }
            i += j;
        }

        System.out.println(i);

        ///////////////////////////
        int y = 0;
        int z = 1;

        while (true) {
            y += z;
            z++;
            if (z == 11) break;
        }

        System.out.println(y);
    }
}
