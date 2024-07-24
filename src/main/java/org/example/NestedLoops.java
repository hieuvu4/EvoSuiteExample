package org.example;

public class NestedLoops {

    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    sum += matrix[i][j];
                } else {
                    sum -= matrix[i][j];
                }
            }
        }
        return sum;
    }

}
