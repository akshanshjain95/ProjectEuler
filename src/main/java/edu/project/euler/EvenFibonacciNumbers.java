package edu.project.euler;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(sumOfEvenFibo(1, 2) + 2);
    }

    public static int sumOfEvenFibo(int i, int j) {
        int currSum = i + j;

        if (currSum > 4000000) {
            return 0;
        }

        if (currSum % 2 == 0) {
            return currSum + sumOfEvenFibo(j, currSum);
        } else {
            return sumOfEvenFibo(j, currSum);
        }
    }
}
