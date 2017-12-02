package thisseasx.november2017.experiments.Independent;

public class RecursionTest {

    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(fibonacci(7));
    }

    private static int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n - 1);
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
