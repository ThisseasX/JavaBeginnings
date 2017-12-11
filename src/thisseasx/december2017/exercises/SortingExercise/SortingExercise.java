package thisseasx.december2017.exercises.SortingExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingExercise {

    public static void main(String[] args) {

        Employee e1 = new Employee(213, "Test1");
        Employee e2 = new Employee(17, "Test2");
        Employee e3 = new Employee(412, "Test3");
        Employee e4 = new Employee(21412, "Test3");
        Employee e5 = new Employee(21412, "Test1");

        List<Employee> list = new ArrayList<>(
                Arrays.asList(e1, e2, e3, e4, e5));

//        Collections.sort(list);
//        list.sort(new EmployeeComparator());
        list.sort(Comparator
                .comparing(Employee::getId)
                .thenComparing(Employee::getName));

        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
