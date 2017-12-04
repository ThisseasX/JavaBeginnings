package thisseasx.december2017.exercises.DivisionExercise;

class DomesticDivision extends Division {

    private String state;

    DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    void display() {
        super.display();
        System.out.printf(" and it is located in %s.\n\n",
                state);
    }
}
