package com.joao.exercises.methods.main;

import com.joao.exercises.methods.model.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Joao";
        person.setAge(19);
        person.printInfo();
        person.setAge(-19);
        person.printInfo();
        person.setAge(19);
        person.printInfo();
        person.name = null;
        person.printInfo();


    }
}
