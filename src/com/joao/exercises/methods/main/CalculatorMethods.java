package com.joao.exercises.methods.main;

import com.joao.exercises.methods.model.Calculator;

public class CalculatorMethods {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(15, 30));
        System.out.println(calculator.subtract(30,15));
        System.out.println(calculator.multiply(30,15));
        calculator.division(30,15);
    }
}
