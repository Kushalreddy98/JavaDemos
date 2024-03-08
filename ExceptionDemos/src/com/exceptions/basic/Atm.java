package com.exceptions.basic;

public class Atm {
    public static void main(String[] args) {
        System.out.println("In Atm");
        Bank bank=new Bank();
        try{
            bank.withdraw(2200);
            System.out.println("Withdraw Completed");
        } catch (Exception e){
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
        System.out.println("GoodBye");
    }
}
