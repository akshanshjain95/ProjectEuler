package edu.project.euler;

public class TenThousandFirstPrimeNumber {

    public static void main(String[] args) {
        int n = 10001;
        int curr = 0;
        int i = 2;
        int prime = 0;

        while (curr != n) {
            if (isPrime(i)) {
                curr++;
                prime = i;
            }

            i++;
        }

        System.out.println(prime);
    }

    private static boolean isPrime(int n) {
        for (int i=2 ; i<=Math.sqrt(n) ; i++) {
            if (n%i == 0) {
                return false;
            }
        }

        return true;
    }
}
