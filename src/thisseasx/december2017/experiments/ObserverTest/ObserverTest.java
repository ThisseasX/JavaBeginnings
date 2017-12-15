package thisseasx.december2017.experiments.ObserverTest;

public class ObserverTest {

    public static void main(String[] args) {
        Person p1 = new Person("Thiss");
        Person p2 = new Person("Olga");
        Person p3 = new Person("Kwn");
        Person p4 = new Person("Dimou");

        Product product = new Product("Guitar", "Instrument", false);

        product.addObserver(p1);
        product.addObserver(p2);
        product.addObserver(p3);
        product.addObserver(p4);

        product.setAvailable(false);
        product.setAvailable(true);
        product.setAvailable(true);
        product.setAvailable(true);

        System.out.println();
        product.setAvailable(false);
    }
}
