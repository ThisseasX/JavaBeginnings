package thisseasx.december2017.exercises.ExceptionsExercise;

import thisseasx.december2017.exercises.ExceptionsExercise.Exceptions.AnotherDigitException;
import thisseasx.december2017.exercises.ExceptionsExercise.Exceptions.DigitException;

class Bootcamp {

    static void welcome(double d) throws DigitException, AnotherDigitException {
        String stringValue = String.valueOf(d);
        if (d > 25) throw new DigitException(stringValue);
        else throw new AnotherDigitException(stringValue);
    }

    static int bye() {
        try {
            welcome(299.7);
        } catch (DigitException e) {
            return 605;
        } catch (AnotherDigitException e) {
            return 230;
        }
        return -1;
    }
}
