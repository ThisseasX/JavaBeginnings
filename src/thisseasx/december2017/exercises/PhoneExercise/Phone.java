package thisseasx.december2017.exercises.PhoneExercise;

abstract class Phone {

    private String brand;
    double price;

    Phone(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }

    double getPrice() {
        return price;
    }

    abstract void setPrice();
}
