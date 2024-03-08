package com.oops.abstraction;

public class SubBranch extends Branch2 {

    void subPay(){
            System.out.println("Payment in SubBranch");
        }

    @Override
    void carLoan() {
        System.out.println("Car Loan in SubBranch");
    }
}

