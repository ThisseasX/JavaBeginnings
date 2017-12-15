package thisseasx.december2017.experiments.EnumTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumTest {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Kwn", MaritalStatus.COMPLICATED, Salary.HIGH),
                new Person("Thiss", MaritalStatus.MARRIED, Salary.CHARITY)
        ));

        for (Person p : list) {
            System.out.printf("%s's marital status is: %s. He is a %s-paid employee, earning %s per month.%n",
                    p.getName(), p.getStatus(), p.getSalary(), p.getSalaryValue());
        }
    }
}
