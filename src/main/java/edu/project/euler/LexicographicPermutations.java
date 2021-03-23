package edu.project.euler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LexicographicPermutations {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(nthPerm(list, 1000000, 0, new ArrayList<>()).stream().map(String::valueOf).collect(Collectors.joining()));
    }

    private static List<Integer> nthPerm(List<Integer> digits, int n, int permsDone, List<Integer> result) {
        for (int i=0 ; i < digits.size() ; i++) {
            int temp = permsDone + factorial(digits.size() - 1);

            if (temp >= n) {
                result.add(digits.get(i));
                digits.remove(i);
                return nthPerm(digits, n, permsDone, result);
            } else {
                permsDone = temp;
            }
        }

        return result;
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
}
