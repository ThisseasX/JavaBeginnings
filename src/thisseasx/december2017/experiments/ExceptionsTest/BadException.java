package thisseasx.december2017.experiments.ExceptionsTest;

class BadException extends Exception {

    BadException() {
        super("BadException");
    }

    BadException(String message) {
        super(message);
    }
}
