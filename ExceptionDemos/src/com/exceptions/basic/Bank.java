package com.exceptions.basic;

public class Bank {
    double balance;
    void withdraw(int amount) throws Exception {
        try{
            if(amount>1000)
                throw new Exception("Amount is greater than 1000");
            balance=3000-amount;
            System.out.println(balance);
        }catch(Exception e){
            System.out.println("Error ...");
            throw e;
        }finally {
            System.out.println("Close DB");
        }
        System.out.println("Completed..");
    }

}
