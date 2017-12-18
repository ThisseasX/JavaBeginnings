package thisseasx.december2017.experiments.FactoryTest;

import static thisseasx.december2017.experiments.FactoryTest.CarFactory.CarType;

public class FactoryTest {

    public static void main(String[] args) {
        Car c1 = CarFactory.newCar(CarType.SMALL);
        Car c2 = CarFactory.newCar(CarType.LUXURY);

        c1.startEngine();
        c1.drive();

        System.out.println();

        c2.startEngine();
        c2.drive();
    }
}
