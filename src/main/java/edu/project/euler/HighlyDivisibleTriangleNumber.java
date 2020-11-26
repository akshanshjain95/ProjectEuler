package edu.project.euler;

public class HighlyDivisibleTriangleNumber {

    public static void main(String[] args) {
        long n = 1;
        while (true) {
            long triangleNumber = (n * (n+1) / 2);

            long numOfDivisors = numOfDivisors(triangleNumber);
            if (numOfDivisors >= 500) {
                System.out.println(triangleNumber);
                return;
            }

            n++;
        }
    }

    private static long numOfDivisors(long n) {
        long count = 0;
        for (long i=1 ; i<=Math.sqrt(n) ; i++) {
            if (n%i == 0) {
                if (n / i == i)
                    count++;
                else
                    count+=2;
            }
        }

        return count;
    }
}
