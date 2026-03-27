package com.joao.exercises.methods.model;

public class Calculator {
    public double sum(double number1, double number2) {
        double sum = number1 + number2;
        return sum;
    }

    public double subtract(double number1, double number2) {
        double subtract = number1 - number2;
        return subtract;
    }

    public double multiply(double number1, double number2) {
        double multiply = number1 * number2;
        return multiply;
    }

    public void division(double number1, double number2) {
        if (number1 == 0 && number2 == 0) {
            System.out.println("Indetermination!");
            return;
        }
        if (number2 == 0) {
            System.out.println("Indefinite!");
            return;
        }
        System.out.println(number1/number2);
    }
}
