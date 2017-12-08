package thisseasx.december2017.exercises.PhoneExercise;

public class PhoneExercise {

    public static void main(String[] args) {

        Phone[] phones = new Phone[]{
                new Android("Samsung"),
                new NonAndroid("Apple"),
                new Android("LG"),
                new NonAndroid("Nokia"),
                new Android("Xiaomi"),
                new NonAndroid("Microsoft"),
                new Android("Google")
        };

        for (Phone phone : phones) {
            System.out.printf("The price of %s phones is: €%s.\n", phone.getBrand(), phone.getPrice());
        }
    }
}
