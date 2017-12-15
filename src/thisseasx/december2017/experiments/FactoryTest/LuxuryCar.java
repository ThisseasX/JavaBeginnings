package thisseasx.december2017.experiments.FactoryTest;

class LuxuryCar implements Car {

    private String engine;
    private String wheels;
    private String aerofoil;

    void setEngine(String engine) {
        this.engine = engine;
    }

    void setWheels(String wheels) {
        this.wheels = wheels;
    }

    void setAerofoil(String aerofoil) {
        this.aerofoil = aerofoil;
    }

    @Override
    public void startEngine() {
        System.out.printf("%s's %s is starting!%n",
                this.getClass().getSimpleName(), engine);
    }

    @Override
    public void drive() {
        System.out.printf("%s is driving on %s with %s!%n",
                this.getClass().getSimpleName(), wheels, aerofoil);
    }
}
