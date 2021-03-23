package edu.project.euler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class DistinctPowers {

    public static void main(String[] args) {
        Set<BigInteger> set = new HashSet<>();

        for (int i=2 ; i<101 ; i++) {
            BigInteger result = new BigInteger(String.valueOf(i));

            for (int j=2 ; j<101 ; j++) {
                BigInteger pow = result.pow(j);
                set.add(pow);
            }
        }

        System.out.println(set.size());
    }
}
