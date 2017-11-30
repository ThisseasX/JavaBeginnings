package kwnstantinos;

public class ExerciseSe7en {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
