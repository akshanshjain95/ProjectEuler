package edu.project.euler;

import java.util.HashSet;
import java.util.Iterator;

public class AmicableNumbers {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int total = 0;
        for (int i=2 ; i<10000 ; i++) {
            if (set.contains(i)) {
                continue;
            }
            int sum = sumOfDivisors(i);

            if (sum != i && sumOfDivisors(sum) == i) {
                total += i + sum;
                set.add(i);
                set.add(sum);
            }
        }

        System.out.println(total);
    }

    private static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i=1 ; i<=n/2 ; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
