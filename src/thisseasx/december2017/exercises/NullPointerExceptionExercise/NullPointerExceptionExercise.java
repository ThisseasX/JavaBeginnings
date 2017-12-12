package thisseasx.december2017.exercises.NullPointerExceptionExercise;

public class NullPointerExceptionExercise {

    public static void main(String[] args) {

        String string = null;

        try {
            string.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
