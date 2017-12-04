package thisseasx.december2017.exercises.DivisionExercise;

public class UseDivision {

    public static void main(String[] args) {
        Division id = new InternationalDivision(
                "Marketing",
                1234,
                "Greece",
                "Greek");
        Division dd = new DomesticDivision(
                "HR",
                5678,
                "Arizona");

        id.display();
        dd.display();
    }
}
