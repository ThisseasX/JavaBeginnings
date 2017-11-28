package com.thisseasx.november2017.exercises;

public class AnimalExercise {
    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "wolf", "sheep", "pig", "raccoon", "panther", "tiger", "parrots", "elephant" };
        for (String animal : animals) if (!animal.startsWith("p")) System.out.println(animal);
    }
}
