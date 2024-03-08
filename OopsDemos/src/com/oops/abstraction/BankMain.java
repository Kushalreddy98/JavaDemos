package com.oops.abstraction;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Branch1();
        bank.carLoan();
        bank.eduLoan();
        bank.housingLoan();
        bank.admin();
        System.out.println();
        Branch1 branch1=(Branch1)bank;
        branch1.staffDetails();
        System.out.println();
        bank=new SubBranch();
        bank.carLoan();
        System.out.println();
        SubBranch subBranch = new SubBranch();
        subBranch.subPay();
        System.out.println();
        Branch2 branch2= new SubBranch();
        branch2.housingLoan();
        branch2.eduLoan();
        branch2.loanType();
    }
}
