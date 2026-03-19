package com.joao.exercises;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[arr.length];
        int arraySize = arr.length;
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arraySize - i - 1];
        }
        System.out.println("Original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        System.out.println("Reversed:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
