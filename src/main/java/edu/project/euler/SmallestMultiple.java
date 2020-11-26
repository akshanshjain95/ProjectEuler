package edu.project.euler;

public class SmallestMultiple {

    public static void main(String[] args) {
        boolean isDivisibleByAll = false;
        int n = 20;
        long start = System.currentTimeMillis();
        while (!isDivisibleByAll) {
            isDivisibleByAll = true;
            for (int i = 1; i < 20; i++) {
                if (n%i != 0) {
                    n+=n;
                    isDivisibleByAll = false;
                    break;
                }
            }
        }

        System.out.println(System.currentTimeMillis() - start);
        System.out.println(n);
    }
}
