package com.joao.exercises.fundamentals;

public class AboveAverageCounter {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        double average;
        int aboveAverage = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = (double) sum / arr.length;
        for (int num : arr) {
            if (num > average) {
                aboveAverage++;
            }
        }
        System.out.println("Average: " + average);
        System.out.println("Above average: " + aboveAverage);

    }
}
