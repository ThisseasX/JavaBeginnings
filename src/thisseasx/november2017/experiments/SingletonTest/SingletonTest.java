package thisseasx.november2017.experiments.SingletonTest;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        System.out.println(s);
        Singleton b = Singleton.getInstance();
        System.out.println(b);
        Singleton c = Singleton.getInstance();
        System.out.println(c);
    }
}
