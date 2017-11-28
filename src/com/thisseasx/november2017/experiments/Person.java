package com.thisseasx.november2017.experiments;

public class Person {

    // Fields
    String name;
    int age;
    int salary;

    Person() {
        // Empty constructor in case we need to create a new Person without filling the fields immediately.
    }

    // Constructor
    Person(String newName, int newAge, int newSalary) {
        name = newName;
        age = newAge;
        salary = newSalary;
    }

    // Method that belongs to each Person Object created from the Person class.
    public void run() {
        System.out.printf("%s is running, because he is earning %s dollars per month!\n", name, salary);
    }
}
