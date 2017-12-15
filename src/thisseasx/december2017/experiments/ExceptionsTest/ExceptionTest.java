package thisseasx.december2017.experiments.ExceptionsTest;

import java.util.Random;

public class ExceptionTest {

    public static void main(String[] args) {
        printRandomNumber();
    }

    private static void printRandomNumber() {
        int i = -1;
        try {
            i = getRandomNumber();
        } catch (FailException | BadException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(i + " FINALLY");
        }
    }

    private static int getRandomNumber() throws FailException, BadException {
        Random r = new Random();
        int i = r.nextInt(100);
        if (i < 33) throw new BadException(i + " FAILED");
        if (i < 66) throw new BadException(i + " BAD");
        else System.out.println(i + " WORKED");
        return i;
    }
}
