package thisseasx.december2017.experiments.EnumTest;

enum Salary {

    CHARITY(0),
    BASIC(500),
    AVERAGE(1000),
    HIGH(2000);

    private int salary;

    Salary(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }
}
