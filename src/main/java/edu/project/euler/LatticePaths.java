package edu.project.euler;

import java.util.Arrays;

public class LatticePaths {

    public static void main(String[] args) {
        long[][] matrix = new long[21][21];

        System.out.println(numOfPaths(matrix, 0,0));
    }

    private static long numOfPaths(long[][] matrix, int i, int j) {
        if (i >= matrix.length || j >= matrix[i].length) {
            return 0;
        }

        if (i == matrix.length - 1 && j == matrix[i].length - 1) {
            return 1;
        }

        if (matrix[i][j] > 0) {
            return matrix[i][j];
        }

        long numOfRightPaths = numOfPaths(matrix, i+1, j);
        long numOfDownPaths = numOfPaths(matrix, i, j+1);

        matrix[i][j] = numOfRightPaths + numOfDownPaths;
        return matrix[i][j];
    }
}
