package edu.project.euler;

public class MultiplesOf3And5 {

    public static void main(String[] args) {
        int numOf3Multis = 999/3;
        int numOf5Multis = 999/5;
        int numOf15Multis = 999/15;

        System.out.println((((numOf3Multis * (numOf3Multis + 1))/2)*3) + (((numOf5Multis * (numOf5Multis + 1))/2)*5) - (((numOf15Multis * (numOf15Multis + 1))/2)*15));
    }
}
