package com.joao.exercises;

public class ArraySum {
    static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double media = (double) sum / arr.length;
        System.out.println(sum);
        System.out.println(media);
    }
}
