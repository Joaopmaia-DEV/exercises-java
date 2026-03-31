package com.joao.exercises.methods.main;

import com.joao.exercises.methods.model.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(2000);
        bankAccount.withdraw(700);
        bankAccount.withdraw(1200);
        bankAccount.deposit(200);
        bankAccount.withdraw(400);
        bankAccount.withdraw(250);
        System.out.println("Final Balance: ");
        bankAccount.printBalance();
    }
}
