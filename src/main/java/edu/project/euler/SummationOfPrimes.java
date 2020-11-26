package edu.project.euler;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SummationOfPrimes {

    static class PrimeMarks {
        long n;
        boolean marked;
    }
    public static void main(String[] args) {
        int n = 2000000;
        List<PrimeMarks> integers = IntStream.range(0, n).mapToObj(i -> {
            PrimeMarks primeMarks = new PrimeMarks();
            primeMarks.n = i;
            primeMarks.marked = false;

            return primeMarks;
        }).collect(Collectors.toList());

        for (long i=2 ; i<=Math.sqrt(n) ; i++) {
            double pow = Math.pow(i, 2);
            if (pow > n) {
                break;
            }
            int squared = (int) pow;
            if (integers.get(squared).marked) {
                continue;
            }

            for (int j=squared ; j<n ; j+=i) {
                PrimeMarks primeMarks = integers.get(j);

                primeMarks.marked = true;
            }
        }

//        integers.stream().filter(primeMarks -> !primeMarks.marked).forEach(primeMarks -> {
//            System.out.println(primeMarks.n);
//        });
        System.out.println(integers.stream().filter(primeMarks -> !primeMarks.marked)
                .mapToLong(primeMarks -> primeMarks.n).sum() - 1);
    }
}
