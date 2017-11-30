package thisseasx.november2017.experiments;

public class LoopTest {

    public static void main(String[] args) {
        int x = 10;

        while (x < 20) {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        }

        System.out.println("Final Value: " + x);

        for (int y = 0; y < 20; y++) {
            System.out.println(y);
        }
    }
}
