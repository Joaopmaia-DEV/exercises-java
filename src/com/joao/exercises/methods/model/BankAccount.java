package com.joao.exercises.methods.model;

public class BankAccount {
    String owner;
    double balance;

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("After deposit: ");
        printBalance();
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("After withdraw: ");
            printBalance();
            return;
        }
        System.out.println("Insufficient funds");

    }

    public void printBalance() {
        System.out.println("Balance: "+this.balance+"\n");
    }
}
