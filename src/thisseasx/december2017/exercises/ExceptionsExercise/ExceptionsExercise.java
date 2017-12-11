package thisseasx.december2017.exercises.ExceptionsExercise;

import thisseasx.december2017.exercises.ExceptionsExercise.Exceptions.AnotherDigitException;
import thisseasx.december2017.exercises.ExceptionsExercise.Exceptions.DigitException;

public class ExceptionsExercise {

    public static void main(String[] args) {
        try {
            Bootcamp.welcome(26);
        } catch (DigitException | AnotherDigitException e) {
            e.printStackTrace();
        }
    }
}
