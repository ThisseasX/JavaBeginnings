package thisseasx.february2018.exercises.StringSpeed;

@SuppressWarnings({"unused", "StringConcatenationInLoop", "MismatchedQueryAndUpdateOfStringBuilder"})
public class StringSpeed {

    private static final int TIMES = 20;
    private static final String SAMPLE = "Hello World";

    public static void main(String[] args) {
        stringFormat();
        stringAdd();

        stringConcatenation();
        stringConcatenationReverse();

        stringConcat();
        stringConcatReverse();

        stringBuild();
        stringBuildReverse();
    }

    private static void stringFormat() {
        long startTime = System.nanoTime();
        String s = String.format("%s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World",
                "Hello World"
        );

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with Format: %s%n", elapsedTime);
    }

    private static void stringAdd() {
        long startTime = System.nanoTime();
        String s = "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World" +
                "Hello World";

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with Add: %s%n", elapsedTime);
    }

    private static void stringConcatenation() {
        long startTime = System.nanoTime();
        String s = "Hello World";

        for (int times = 0; times < TIMES; times++) s += SAMPLE;

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with Concatenation: %s%n", elapsedTime);
    }

    private static void stringConcatReverse() {
        long startTime = System.nanoTime();
        String s = "Hello World";

        for (int times = TIMES; times > 0; times--) s = s.concat(SAMPLE);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with ConcatReverse: %s%n", elapsedTime);
    }

    private static void stringConcat() {
        long startTime = System.nanoTime();
        String s = "Hello World";

        for (int times = 0; times < TIMES; times++) s = s.concat(SAMPLE);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with Concat: %s%n", elapsedTime);
    }

    private static void stringConcatenationReverse() {
        long startTime = System.nanoTime();
        String s = "Hello World";

        for (int times = TIMES; times > 0; times--) s += SAMPLE;

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with ConcatenationReverse: %s%n", elapsedTime);
    }

    private static void stringBuild() {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int times = 0; times < TIMES; times++) sb.append("Hello World");

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with Build: %s%n", elapsedTime);
    }

    private static void stringBuildReverse() {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int times = TIMES; times > 0; times--) sb.append("Hello World");

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Elapsed Time with BuildReverse: %s%n", elapsedTime);
    }
}
