package thisseasx.december2017.experiments.CustomListTest;

public class CustomListTest {

    public static void main(String[] args) {
        Box<Person> personBox = new Box<>(
                new Person("Thiss"),
                new Person("Kwn")
        );

        personBox.forEach(System.out::println);
        System.out.println();

        personBox.add(new Person("Olga"));
        personBox.forEach(System.out::println);
        System.out.println();

        personBox.remove(1);
        personBox.forEach(System.out::println);
        System.out.println();

        personBox.clear();
        personBox.forEach(System.out::println);
        System.out.println();
    }
}
