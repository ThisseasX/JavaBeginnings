package com.thisseasx.november2017.experiments;

public class StringTest {
    public static void main(String[] args) {
        String a = "Opopopopo";
        String b = " Two";
        int i = a.indexOf("l",3);
        a = a.concat(b);
        System.out.println(i);
    }
}
