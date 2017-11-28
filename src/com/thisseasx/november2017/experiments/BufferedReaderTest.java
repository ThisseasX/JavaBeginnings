package com.thisseasx.november2017.experiments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        StringBuilder sb = new StringBuilder();
        br = new BufferedReader(new FileReader("C://my_file.txt"));

        while (br.ready()) {
            sb.append(br.readLine()).append("\n");
        }
        br.close();

        System.out.println(sb.toString());
    }
}
