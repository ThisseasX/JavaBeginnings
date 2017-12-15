package thisseasx.december2017.experiments.FactoryTest;

class LuxuryCar extends SmallCar {

    private String aerofoil;

    String getAerofoil() {
        return aerofoil;
    }

    void setAerofoil(String aerofoil) {
        this.aerofoil = aerofoil;
    }

    @Override
    public void startEngine() {
        System.out.printf("%s's %s is starting!%n",
                this.getClass().getSimpleName(), getEngine());
    }

    @Override
    public void drive() {
        System.out.printf("%s is driving on %s with %s!%n",
                this.getClass().getSimpleName(), getWheels(), getAerofoil());
    }
}
