package edu.project.euler;

public class NumberSprialDiagonals {

    public static void main(String[] args) {
        long limit = 1001;
        long currDiff = 2;
        long num = 1;
        long timesAdded = 0;
        long result = 1;

        while (currDiff < limit) {
            num += currDiff;
            result += num;

            timesAdded++;
            if (timesAdded % 4 == 0) {
                timesAdded = 0;
                currDiff += 2;
            }
        }

        System.out.println(result);
    }
}
