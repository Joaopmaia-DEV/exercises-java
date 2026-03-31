package com.joao.exercises.methods.model;

public class Person {
    public String name;
    public int age;

    public void printInfo() {
        if (age >= 0) {
            if (name == null) {
                System.out.println("You must write a name");
                return;
            }
            System.out.println("Name: " + this.name);

            System.out.println("Age: " + this.age);
            return;
        }
        System.out.println("\nInvalid age\n");
    }

    public void setAge(int age) {
        this.age = age;
    }
}
