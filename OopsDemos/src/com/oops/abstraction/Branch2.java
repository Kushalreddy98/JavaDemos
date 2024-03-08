package com.oops.abstraction;

public abstract class Branch2 extends Bank {

    @Override
    void housingLoan() {
        System.out.println("Housing Loan in Branch2");
    }

    @Override
    void eduLoan() {
        System.out.println("Education Loan in Branch2");

    }

    void loanType() {
        System.out.println("Loan in Branch2");
    }
}
