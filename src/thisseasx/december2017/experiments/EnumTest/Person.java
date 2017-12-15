package thisseasx.december2017.experiments.EnumTest;

class Person {

    private String name;
    private MaritalStatus status;
    private Salary salary;

    Person(String name, MaritalStatus status, Salary salary) {
        this.name = name;
        this.status = status;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    MaritalStatus getStatus() {
        return status;
    }

    Salary getSalary() {
        return salary;
    }

    int getSalaryValue() {
        return salary.getSalary();
    }
}
