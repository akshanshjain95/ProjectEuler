package edu.project.euler;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        double v = 600851475143d;
        double i;
        double res = 0;
        for (i = 2; i<=v ; i++) {
            while (v%i == 0) {
                v = v/i;
                res = i;
            }
        }

        System.out.println(res);
    }
}
