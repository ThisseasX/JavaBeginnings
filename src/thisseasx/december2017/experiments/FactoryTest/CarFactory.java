package thisseasx.december2017.experiments.FactoryTest;

class CarFactory {

    enum CarType {
        SMALL,
        LUXURY
    }

    static Car newCar(CarType type) {
        switch (type) {
            case SMALL:
                SmallCar sc = new SmallCar();
                sc.setEngine("small engine");
                sc.setWheels("small wheels");
                return sc;
            case LUXURY:
                LuxuryCar lc = new LuxuryCar();
                lc.setEngine("luxury engine");
                lc.setWheels("luxury wheels");
                lc.setAerofoil("luxury aerofoil");
                return lc;
            default:
                return new Car() {
                    @Override
                    public void startEngine() {

                    }

                    @Override
                    public void drive() {

                    }
                };
        }
    }
}
