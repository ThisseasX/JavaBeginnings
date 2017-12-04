package thisseasx.december2017.experiments.CastingTest;

public class CastTest {

    public static void main(String[] args) {

        Animal a;
        a = new Cat();

        Dog c = new Dog();

        c = (Dog) a;

    }
}
