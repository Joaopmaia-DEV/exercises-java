package com.joao.exercises.fundamentals;

public class GreaterThanTen {
     public void main(String[] args) {
        int[] arr = new int[]{5, 12, 3, 20, 8, 15};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10){
                System.out.println(arr[i]);
            }
        }
    }
}
