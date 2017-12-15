package thisseasx.december2017.exercises.SortingExercise;

import java.util.Comparator;

@SuppressWarnings("unused")
class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int result = o1.getId() - o2.getId();
        if (result != 0) return result;
        else return o1.getName().compareTo(o2.getName());
    }
}
