package thisseasx.december2017.experiments.EqualsTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StudentTest {

    public static void main(String[] args) {
        Student s = new Student("Thiss", 123);
        Student s2 = new Student("Thiss", 123);
        Student s3 = new Student("Thiss1", 123);

        Set<Student> set = new HashSet<>(Arrays.asList(s, s2, s3));

//        System.out.println(s.equals(s2)); // true
//        System.out.println(s.equals(s3)); // false
//        System.out.println(s2.equals(s3)); // false

        System.out.println(set.contains(new Student("Thiss", 123)));
        System.out.println(set.remove(new Student("Thiss", 123)));
        System.out.println(set.size());
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
