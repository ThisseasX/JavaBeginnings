package thisseasx.december2017.experiments.FactoryTest;

class SmallCar extends Car {

    private String wheels;

    String getWheels() {
        return wheels;
    }

    void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public void startEngine() {
        System.out.printf("%s's %s is starting!%n",
                this.getClass().getSimpleName(), getEngine());
    }

    @Override
    public void drive() {
        System.out.printf("%s is driving on %s!%n",
                this.getClass().getSimpleName(), getWheels());
    }
}
