package thisseasx.december2017.experiments.ExceptionsTest;

class FailException extends Exception {

    FailException() {
        super("FailException");
    }

    FailException(String message) {
        super(message);
    }
}
