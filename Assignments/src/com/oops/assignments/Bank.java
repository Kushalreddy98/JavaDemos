package com.oops.assignments;

public class Bank {
    Double balance;

    public Bank(Double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        balance -= amount;
        //System.out.println(balance);
        System.out.println("Thank you for banking");
    }

    void deposit(double amount) {
        balance += amount;
        //System.out.println(balance);
        System.out.println("Thank you for banking");
    }

    double getBalance() {
        return balance;
    }
}
