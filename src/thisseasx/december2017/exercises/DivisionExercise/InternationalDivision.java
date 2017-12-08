package thisseasx.december2017.exercises.DivisionExercise;

class InternationalDivision extends Division {

    private String country;
    private String language;

    InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    void display() {
        super.display();
        System.out.printf(", and it is located in %s, which is a %s-speaking country.\n\n",
                country, language);
    }
}
