package thisseasx.december2017.exercises.ExceptionsExercise.Exceptions;

public class AnotherDigitException extends Exception {

    private static final String EXCEPTION_NAME = "AnotherDigitException";

    public AnotherDigitException() {
        super(EXCEPTION_NAME);
    }

    public AnotherDigitException(String message) {
        super(EXCEPTION_NAME + " with argument: " + message);
    }
}
