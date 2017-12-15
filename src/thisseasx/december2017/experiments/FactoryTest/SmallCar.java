package thisseasx.december2017.experiments.FactoryTest;

class SmallCar implements Car {

    private String engine;
    private String wheels;

    void setEngine(String engine) {
        this.engine = engine;
    }

    void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public void startEngine() {
        System.out.printf("%s's %s is starting!%n",
                this.getClass().getSimpleName(), engine);
    }

    @Override
    public void drive() {
        System.out.printf("%s is driving on %s!%n",
                this.getClass().getSimpleName(), wheels);
    }
}
