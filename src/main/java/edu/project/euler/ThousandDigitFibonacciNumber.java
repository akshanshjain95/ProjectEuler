package edu.project.euler;

import java.math.BigInteger;

public class ThousandDigitFibonacciNumber {

    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");
        BigInteger start = new BigInteger("0");
        int index = 1;

        while (result.toString().length() < 1000) {
            BigInteger temp = result;
            result = result.add(start);
            start = temp;
            index++;
        }

        System.out.println(index);
    }
}
