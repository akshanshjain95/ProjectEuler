package edu.project.euler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class NamesScores {

    public static void main(String[] args) throws IOException {
        String[] names = Files.readAllLines(Paths.get("names.txt")).get(0).replaceAll("\"", "").split(",");

        Arrays.sort(names);

        long sum = 0;
        for (int i=0 ; i<names.length ; i++) {
            long nameSum = 0;

            for (int j=0 ; j<names[i].length() ; j++) {
                long currValue = names[i].charAt(j) - 64;
                nameSum += currValue;
            }

            sum += nameSum * (i+1);
        }

        System.out.println(sum);
    }
}
