package edu.project.euler;

public class CoinSums {

    public static void main(String[] args) {
        int[] constants = new int[8];
        constants[0] = 200;
        constants[1] = 100;
        constants[2] = 50;
        constants[3] = 20;
        constants[4] = 10;
        constants[5] = 5;
        constants[6] = 2;
        constants[7] = 1;

        System.out.println(ways(200, constants, 0));
    }

    private static int ways(int sum, int[] constants, int currIndex) {
        if (currIndex == 7) {
            if (sum >= 0)
                return 1;
            else
                return 0;
        }

        int count = ways(sum, constants, currIndex+1);

        while (sum >= 0) {
            sum -= constants[currIndex];

            if (sum == 0) {
                return ++count;
            }

            count += ways(sum, constants, currIndex + 1);
        }

        return count;
    }
}
