package thisseasx.november2017.experiments.Independent;

public class MethodTest {

    public static void main(String[] args) {
        System.out.println(minFunction(9,2));
        System.out.println(minFunctionSimple(9,2));
    }

    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    public static int minFunctionSimple(int n1, int n2) {
        return n1 > n2 ? n2 : n1;
    }
}
