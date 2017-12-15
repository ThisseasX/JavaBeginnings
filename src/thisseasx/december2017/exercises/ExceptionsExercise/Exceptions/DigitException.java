package thisseasx.december2017.exercises.ExceptionsExercise.Exceptions;

public class DigitException extends Exception {

    private static final String EXCEPTION_NAME = "DigitException";

    public DigitException() {
        super(EXCEPTION_NAME);
    }

    public DigitException(String message) {
        super(EXCEPTION_NAME + " with argument: " + message);
    }
}
