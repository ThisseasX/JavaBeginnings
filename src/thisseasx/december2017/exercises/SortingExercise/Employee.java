package thisseasx.december2017.exercises.SortingExercise;

class Employee implements Comparable<Employee> {

    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        int result = getId() - o.getId();
        if (result != 0) return result;
        else return getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return String.format("Employee #%s named '%s'",
                this.id, this.name);
    }
}
