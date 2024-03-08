package com.oops.abstraction;

public class Branch1 extends Bank{
    @Override
    void carLoan() {
        System.out.println("Car Loan in Branch1");
    }

    @Override
    void housingLoan() {
        System.out.println("Housing Loan in Branch1");
    }

    @Override
    void eduLoan() {
        System.out.println("Education Loan in Branch1");
    }
    //Own Method
    void staffDetails(){
        System.out.println("Staff in Branch1");
    }
}
