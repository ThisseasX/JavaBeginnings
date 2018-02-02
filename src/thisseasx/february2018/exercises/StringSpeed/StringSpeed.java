package thisseasx.february2018.exercises.StringSpeed;

public class StringSpeed {

    private static final int TIMES = 5000;
    private static final String SAMPLE = "Hello World";

    public static void main(String[] args) {
        stringConcat();
        stringConcatReverse();
        stringBuild();
    }

    private static void stringConcat() {
        long startTime = System.nanoTime();
        String s = "Hello World";

        for (int i = 0; i < TIMES; i++) s += SAMPLE;

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with Concat: %s%n", elapsedTime);
    }

    private static void stringConcatReverse() {
        long startTime = System.nanoTime();
        String s = "Hello World";

        for (int times = TIMES; times > 0; times--) s += SAMPLE;

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with ConcatReverse: %s%n", elapsedTime);
    }

    private static void stringBuild() {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < TIMES; i++) sb.append("Hello World");

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with Build: %s%n", elapsedTime);
    }
}
