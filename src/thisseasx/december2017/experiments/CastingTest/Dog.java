package thisseasx.december2017.experiments.CastingTest;

class Dog extends Animal {

    @Override
    void callme() {
        System.out.println("Animal Override");
    }

    void callme2() {
        System.out.println("Called Dog");
    }
}
