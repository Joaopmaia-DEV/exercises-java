package com.joao.exercises;

public class PositiveNegativeZeroCounter {
    public static void main(String[] args) {
        int[] arr = new int[]{-3, 5, -1, 10, 0};
        int counterPositive = 0;
        int counterNegative = 0;
        int counterZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counterPositive++;

            } else if (arr[i] < 0) {
                counterNegative++;
            } else {
                counterZero++;
            }
        }
        System.out.println("Positives: " + counterPositive);
        System.out.println("Negatives: " + counterNegative);
        System.out.println("Zero: " + counterZero);
    }
}
