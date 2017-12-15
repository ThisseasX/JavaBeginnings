package thisseasx.december2017.experiments.FactoryTest;

import static thisseasx.december2017.experiments.FactoryTest.CarFactory.CarType.LUXURY;
import static thisseasx.december2017.experiments.FactoryTest.CarFactory.CarType.SMALL;

public class FactoryTest {

    public static void main(String[] args) {
        Car c1 = CarFactory.newCar(SMALL);
        Car c2 = CarFactory.newCar(LUXURY);

        c1.startEngine();
        c1.drive();

        System.out.println();

        c2.startEngine();
        c2.drive();
    }
}
