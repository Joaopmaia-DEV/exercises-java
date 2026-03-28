package com.joao.exercises.methods.main;

import com.joao.exercises.methods.model.Student;

public class StudentAverageMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.grade1 = 4.2;
        student.grade2 = 5.8;
        student.grade3 = 9.5;
        System.out.println("Average: "+student.calculateAverage());
        System.out.println("Approved: "+student.isApproved());
    }
}
