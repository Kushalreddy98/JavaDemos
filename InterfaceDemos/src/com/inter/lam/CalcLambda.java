package com.inter.lam;

import java.sql.SQLOutput;

public class CalcLambda {
    public static void main(String[] args) {
        IMyCalculator calc=(int x,int y)->x+y;
        System.out.println(calc.calculate(10,20));
        calc=( x, y)->x*y;
        System.out.println(calc.calculate(5,20));
        calc=( x, y)->x/y;
        System.out.println(calc.calculate(30,2));
    }
}
