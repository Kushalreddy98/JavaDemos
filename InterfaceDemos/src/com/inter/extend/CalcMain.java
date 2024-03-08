package com.inter.extend;

import com.inter.basics.ICompressor;

public class CalcMain {
    public static void main(String[] args) {
        ICalculator calculator=new BasicCalculator();
        calculator.add(2,3);
        calculator.product(5,6);
        System.out.println();
        ScientificCalc scientificCalc=new ScientificCalc();
        scientificCalc.square(2);
        scientificCalc.cube(2);
        scientificCalc.sub(10,5);

    }
}
