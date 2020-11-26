package edu.project.euler;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
        int lp = 0;
        for (int i=999 ; i>99 ; i--) {
            for (int j=999 ; j>99 ; j--) {
                int prod = i*j;

                if (isPalindrome(prod)) {
                    if (lp < prod)
                        lp = prod;
                }

            }
        }

        System.out.println(lp);
    }

    private static boolean isPalindrome(int n) {
        return n == Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
    }
}
