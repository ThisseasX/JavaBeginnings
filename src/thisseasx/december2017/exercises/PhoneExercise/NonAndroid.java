package thisseasx.december2017.exercises.PhoneExercise;

class NonAndroid extends Phone {

    NonAndroid(String brand) {
        super(brand);
        setPrice();
    }

    @Override
    void setPrice() {
        this.price = 37.99;
    }
}
