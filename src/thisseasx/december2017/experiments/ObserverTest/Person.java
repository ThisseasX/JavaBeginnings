package thisseasx.december2017.experiments.ObserverTest;

import java.util.Observable;
import java.util.Observer;

class Person implements Observer {

    private String personName;

    Person(String personName) {
        this.personName = personName;
    }

    @Override
    public void update(Observable o, Object arg) {
        String availability = (Boolean) arg ? "available" : "sold out";
        System.out.printf("Hello %s, %s is now %s at my store.%n", this.personName, o, availability);
    }
}
