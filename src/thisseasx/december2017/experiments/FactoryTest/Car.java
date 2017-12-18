package thisseasx.december2017.experiments.FactoryTest;

class Car {
    private String engine;

    String getEngine() {
        return engine;
    }

    void setEngine(String engine) {
        this.engine = engine;
    }

    void startEngine() {
        System.out.printf("%s's %s is starting!%n",
                this.getClass().getSimpleName(), engine);
    }

    void drive() {
        System.out.printf("%s is driving!%n",
                this.getClass().getSimpleName());
    }
}
