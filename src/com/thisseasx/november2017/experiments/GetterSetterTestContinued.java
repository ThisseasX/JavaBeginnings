package com.thisseasx.november2017.experiments;

import com.thisseasx.november2017.experiments.GetterSetterTest.Dog;

public class GetterSetterTestContinued {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println(d.getAge());

        d.setAge(4);

        System.out.println(d.getAge());
    }
}
