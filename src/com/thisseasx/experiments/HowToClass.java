package com.thisseasx.experiments;

public class HowToClass {

    public static void main(String[] args) {

        Person myPerson = new Person("Kwn", 12, 999);

        myPerson.name = "Kwn";
        myPerson.age = 12;
        myPerson.salary = 9999;

        addToDatabase(myPerson);
        myPerson.run();
    }

    public static void addToDatabase(Person p) {
        String name = p.name;
        int age = p.age;
        int salary = p.salary;

        System.out.printf("Name: %s, Age: %s, Salary: %s\n", name, age, salary);
    }
}
