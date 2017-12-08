package thisseasx.december2017.exercises.EqualsExercise;

public class EqualsExercise {

    public static void main(String[] args) {
        Employee e1 = new Employee("Thiss", "Xan", 123);
        Employee e2 = new Employee("Thiss", "Xan", 4324);
        Employee e3 = new Employee("sad", "asdad", 123);
        Employee e4 = new Employee("SADSA", "Xan", 55555);

        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));
    }
}
