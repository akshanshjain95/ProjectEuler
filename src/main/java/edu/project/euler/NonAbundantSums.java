package edu.project.euler;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NonAbundantSums {

    public static void main(String[] args) {
        long greatestNum = 28123;
        List<Long> abundantIntegers = LongStream.range(1, greatestNum).filter(i -> i < sumOfDivisors(i)).boxed()
                .collect(Collectors.toList());

        HashSet<Long> sumSet = new HashSet<>();
        for (int i=0 ; i<abundantIntegers.size() ; i++) {
            for (int j=i ; j<abundantIntegers.size() ; j++) {
                if (abundantIntegers.get(i) + abundantIntegers.get(j) <= greatestNum) {
                    sumSet.add(abundantIntegers.get(i) + abundantIntegers.get(j));
                } else {
                    break;
                }
            }
        }

        long sum = 0;
        for (Long summ : sumSet) {
            sum += summ;
        }

        long sumOfFirstGreatestNumInts = greatestNum * (greatestNum + 1) / 2;
        System.out.println(sumOfFirstGreatestNumInts - sum);
    }

    private static long sumOfDivisors(long n) {
        long sum = 0;
        for (int i=1 ; i<=n/2 ; i++) {
            if (n % i == 0)
                sum += i;
        }

        return sum;
    }
}
