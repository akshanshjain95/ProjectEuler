package edu.project.euler;

public class SpecialPythagorasTriplet {

    public static void main(String[] args) {
        int sum = 1000;
        for (int i = 2; i < sum; i++) {
            for (int j = 1; j < i; j++) {
                double k = Math.pow(i, 2) + Math.pow(j, 2);
                if (isPerfectSquare(k) && isSumEqualToN(i, j, Math.sqrt(k), sum)) {
                    System.out.println((long)(i * j * Math.sqrt(k)));
                    return;
                }
            }
        }
    }

    private static boolean isPerfectSquare(double num) {
        double sqrt = Math.sqrt(num);

        return Math.floor(sqrt) == sqrt;
    }

    private static boolean isSumEqualToN(double a, double b, double c, double n) {
        return a + b + c == n;
    }
}
