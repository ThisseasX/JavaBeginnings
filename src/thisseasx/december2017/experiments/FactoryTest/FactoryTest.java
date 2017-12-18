package thisseasx.december2017.experiments.FactoryTest;

import thisseasx.december2017.experiments.FactoryTest.SandwichFactory.Sandwich;

import static thisseasx.december2017.experiments.FactoryTest.SandwichFactory.SandwichType.*;

public class FactoryTest {

    public static void main(String[] args) {
        Sandwich s1 = SandwichFactory.createSandwich(SANDWICH_1);
        System.out.println(s1);

        Sandwich s2 = SandwichFactory.createSandwich(SANDWICH_2);
        System.out.println(s2);

        Sandwich s3 = SandwichFactory.createSandwich(SANDWICH_3);
        System.out.println(s3);
    }
}
