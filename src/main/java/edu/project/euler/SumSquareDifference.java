package edu.project.euler;

public class SumSquareDifference {

    public static void main(String[] args) {
        double sumOfSquares = 0;
        double n = 100;
        for (double i=1 ; i<=n ; i++) {
            sumOfSquares += Math.pow(i, 2);
        }

        double squareSum = Math.pow((n * (n+1))/2, 2);

        System.out.println((long)(squareSum - sumOfSquares));
    }
}
