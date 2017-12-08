package thisseasx.december2017.exercises.DivisionExercise;

abstract class Division {

    private String divisionName;
    private int accountNumber;

    Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    void display() {
        System.out.printf("%s division's account number is: %s",
                divisionName, accountNumber);
    }
}
