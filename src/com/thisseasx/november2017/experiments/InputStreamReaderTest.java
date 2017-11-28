package com.thisseasx.november2017.experiments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Random r = new Random();
        int i = r.nextInt(100);

        System.out.println("What is your name?");

        String name = br.readLine();
        System.out.printf("Hello %s! You are %d%% lucky today!\n", name, i);
    }
}
