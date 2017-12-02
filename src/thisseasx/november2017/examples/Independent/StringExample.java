package thisseasx.november2017.examples.Independent;

public class StringExample {
    public static void main(String[] args) {
        String listOfAnimals = "Dog, Cat, Donkey";
        String[] animals = listOfAnimals.split(",");
        System.out.println("Available animals are:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        String animals2 = "Dog + Cat + Donkey";
        String replaced = animals2.replace("+", "and");
        System.out.println(replaced);
    }
}
