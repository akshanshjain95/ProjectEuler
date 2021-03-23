package edu.project.euler;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuadraticPrimes {

    private static class PrimeMark {
        int n;
        boolean marked;
    }

    public static void main(String[] args) {
        List<PrimeMark> pms = IntStream.range(0, 1000).mapToObj(i -> {
            PrimeMark primeMark = new PrimeMark();
            primeMark.n = i;
            primeMark.marked = false;

            return primeMark;
        }).collect(Collectors.toList());

        for (int i=2 ; i<=Math.sqrt(pms.size()) ; i++) {
            if (pms.get(i).marked) {
                continue;
            }
            int squared = (int) Math.pow(i, 2);

            for (int j=squared ; j < pms.size() ; j+=i) {
                pms.get(j).marked = true;
            }
        }

        List<Integer> primesTillThousand = pms.stream().filter(primeMark -> !primeMark.marked)
                .map(primeMark -> primeMark.n).collect(Collectors.toList());

        primesTillThousand.remove(0); // removing 0
        primesTillThousand.remove(0); // removing 1

        Set<Integer> primesTillThousandSet = new HashSet<>(primesTillThousand);
        int maxPrimes = 0;
        int resA = 0;
        int resB = 0;

        for (Integer prime : primesTillThousand) {
            for (int a=-1000 ; a<1000 ; a++) {
                int numOfPrimes = numOfPrimes(a, prime, primesTillThousandSet);

                if (maxPrimes < numOfPrimes) {
                    maxPrimes = numOfPrimes;
                    resA = a;
                    resB = prime;
                }
            }
        }

        System.out.println(resA * resB);
    }

    private static int numOfPrimes(int a, int b, Set<Integer> primesTillThousand) {
        boolean isPrime = false;
        int n = 0;
        int count = 0;

        do {
            int num = (int) Math.pow(n, 2) + (a*n) + b;

            if (num < 0) {
                isPrime = false;
            } else if ((num < 1000 && primesTillThousand.contains(num)) || isPrime(num)) {
                isPrime = true;
                count++;
            } else {
                isPrime = false;
            }

            n++;
        } while (isPrime);

        return count;
    }

    private static boolean isPrime(int n) {
        for (int i=2 ; i<=n/2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
