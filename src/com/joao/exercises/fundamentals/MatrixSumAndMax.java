package com.joao.exercises.fundamentals;

public class MatrixSumAndMax {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int maxValue = matrix[0][0];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + maxValue);

    }

}
