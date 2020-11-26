package edu.project.euler;

import java.math.BigInteger;

public class PowerDigitSum {

    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("2");
        bigInteger = bigInteger.pow(1000);
        String biStr = bigInteger.toString();

        Integer sum = 0;
        for (int i=0 ; i<biStr.length() ; i++) {
            sum += Integer.parseInt(biStr.charAt(i) + "");
        }

        System.out.println(sum);
    }
}
