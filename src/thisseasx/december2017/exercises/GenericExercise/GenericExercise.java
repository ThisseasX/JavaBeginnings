package thisseasx.december2017.exercises.GenericExercise;

public class GenericExercise {

    public static void main(String[] args) {

        // Creating 3 different Box instances with different types.
        Box<String> stringBox = new Box<>("Test1", "Test2", "Test3");
        Box<Integer> intBox = new Box<>(1, 2, 3);
        Box<Boolean> booleanBox = new Box<>(true, false, true);

        // Printing stringBox and adding a new line afterwards.
        for (int i = 0; i < stringBox.size(); i++) {
            System.out.println(stringBox.get(i));
        }
        System.out.println();

        // Printing intBox and adding a new line afterwards.
        for (int i = 0; i < intBox.size(); i++) {
            System.out.println(intBox.get(i));
        }
        System.out.println();

        // Printing booleanBox.
        for (int i = 0; i < booleanBox.size(); i++) {
            System.out.println(booleanBox.get(i));
        }
    }
}
