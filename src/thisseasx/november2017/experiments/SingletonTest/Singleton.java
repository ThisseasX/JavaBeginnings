package thisseasx.november2017.experiments.SingletonTest;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}
