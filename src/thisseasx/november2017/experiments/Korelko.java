package thisseasx.november2017.experiments;

import kwnstantinos.Person;

public class Korelko {

    private int money = 0;

    public String getMoney() {
        return "Korelko has no money";
    }

    public void pay(Person person) {
        System.out.println(
                getMoney() + "\n" +
                        person.getName() + " will never get paid!!!!!!");
    }
}
