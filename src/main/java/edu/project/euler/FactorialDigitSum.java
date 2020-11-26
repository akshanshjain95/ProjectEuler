package edu.project.euler;

import java.math.BigInteger;

public class FactorialDigitSum {

    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("100");

        String factorial = factorial(bigInteger).toString();
        long sum = 0;

        for (int i=0 ; i<factorial.length(); i++) {
            sum += Integer.parseInt(factorial.charAt(i) + "");
        }

        System.out.println(sum);
    }

    private static BigInteger factorial(BigInteger bigInteger) {
        BigInteger one = new BigInteger("1");
        if (bigInteger.compareTo(one) == 0) {
            return one;
        }

        return bigInteger.multiply(factorial(bigInteger.subtract(one)));
    }
}
