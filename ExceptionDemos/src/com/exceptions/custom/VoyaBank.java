package com.exceptions.custom;

public class VoyaBank {
    double balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }
    void withdraw(int amount) throws OutOfLimitsException, NegativeBalanceException {
        try{
            System.out.println("In withdraw method");
            if(amount>balance)
                throw new OutOfLimitsException("Amount is greater than balance");
            if(balance-amount<=0)
                throw new NegativeBalanceException("Balance is Negative");
        }catch(NegativeBalanceException e){
            System.out.println(e.getMessage());
            throw e;
        }catch(OutOfLimitsException e){
            System.out.println(e.getMessage());
            throw e;
        }finally {
            System.out.println("Closing DataBase");
        }
        System.out.println("Completed");
    }
}
