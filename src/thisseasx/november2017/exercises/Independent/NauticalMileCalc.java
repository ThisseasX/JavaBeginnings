package thisseasx.november2017.exercises.Independent;

public class NauticalMileCalc {

    private static final float KILOMETERS_IN_NAUTICAL_MILE = 1.852f;
    private static final float MILES_IN_NAUTICAL_MILE = 1.150779f;

    public static void main(String[] args) {
        float nauticalMiles = 24;

        float miles = getMiles(nauticalMiles);
        float kilometers = getKilometers(nauticalMiles);

        System.out.printf("%.0f Nautical Miles are equal to %.02f Miles and %.02f Kilometers",
                nauticalMiles, miles, kilometers);
    }

    private static float getMiles(float nauticalMiles) {
        return nauticalMiles * MILES_IN_NAUTICAL_MILE;
    }

    private static float getKilometers(float nauticalMiles) {
        return nauticalMiles * KILOMETERS_IN_NAUTICAL_MILE;
    }
}
