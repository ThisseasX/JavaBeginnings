package thisseasx.december2017.exercises.GenericExercise;

public class GenericExercise {

    public static void main(String[] args) {
        Box<String> box = new Box<>("Test1", "Test2", "Test3");

        for (int i = 0; i < box.size(); i++) {
            System.out.println(box.get(i));
        }
    }
}
