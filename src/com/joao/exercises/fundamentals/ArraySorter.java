package com.joao.exercises.fundamentals;

public class ArraySorter {
    public static void main(String[] args) {
        int memory;
        int[] arr = {5, 2, 8, 1, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length; j > 1; j--) {
                if (i >= arr.length - j + 1)
                    continue;
                if (arr[i] > arr[arr.length - j + 1]) {             // Custom sorting logic; Moves smaller elements to the beginning of the array
                    memory = arr[arr.length - j + 1];
                    arr[arr.length - j + 1] = arr[i];
                    arr[i] = memory;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
