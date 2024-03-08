package com.inter.def;

public class CalculatorImpl implements IBonusCalculator,IAllowanceCalculator {
    @Override
    public void calculate(double amount) {
        System.out.println("The amount is "+amount);
    }

    @Override
    public void policyType() {
        IBonusCalculator.super.policyType();
    }
}
