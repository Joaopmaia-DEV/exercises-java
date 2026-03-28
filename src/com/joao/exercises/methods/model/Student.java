package com.joao.exercises.methods.model;

public class Student {
    public double grade1;
    public double grade2;
    public double grade3;

    public double calculateAverage() {
        return (this.grade1+this.grade2+this.grade3)/3;
    }
    public boolean isApproved(){
        return calculateAverage() >= 7;
    }

}
