package thisseasx.december2017.exercises.PhoneExercise;

class Android extends Phone {

    Android(String brand) {
        super(brand);
        setPrice();
    }

    @Override
    void setPrice() {
        this.price = 24.99;
    }
}
