package edu.project.euler;

public class LongestCollatzSequence {

    public static void main(String[] args) {
        long maxCount = 0;
        long startingNum = 0;
        for (long i=1000000 ; i>=1 ; i--) {

            long temp = i;

            long count = 0;
            while (temp != 1) {
                count++;
                if (temp % 2 == 0) {
                    temp /= 2;
                } else {
                    temp = (3*temp) + 1;
                }
            }

            if (maxCount < count) {
                startingNum = i;
                maxCount = count;
            }
        }

        System.out.println(startingNum);
    }
}
