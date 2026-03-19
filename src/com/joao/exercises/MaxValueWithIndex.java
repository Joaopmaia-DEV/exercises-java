package com.joao.exercises;

public class MaxValueWithIndex {
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 15, 6};
        int maxValue = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }

        }
        System.out.println("Max value: " + maxValue);
        System.out.println("Index: " + maxIndex);
    }
}
