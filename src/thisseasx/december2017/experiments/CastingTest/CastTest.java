package thisseasx.december2017.experiments.CastingTest;

public class CastTest {

    public static void main(String[] args) {

       /* Animal a;

        a = new Cat();

        Dog c = new Dog();

        c = (Dog) a; // java.lang.ClassCastException thrown.*/

        Dog realDog = new Dog();
        Animal animalDog = (Animal) realDog; //Explicitly you have done upcasting. Actually no need, we can directly type cast like Animal a = d; compiler now treat Dog as Animal but still it is Dog even after upcasting
        realDog.callme();
        animalDog.callme(); // It calls Dog's method even though we use Animal reference.
        Dog b = (Dog) animalDog;
        b.callme2();
    }
}
