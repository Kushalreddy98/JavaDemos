package com.exceptions.custom;

public class VoyaAtm {
    public static void main(String[] args) {
        System.out.println("In Voya ATM");

        VoyaBank bank = new VoyaBank(10000);
        try {
            bank.withdraw(2200);
            System.out.println("Withdraw Done");
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        } catch (OutOfLimitsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thank you for Banking");
    }
}
