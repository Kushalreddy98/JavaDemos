package com.inter.extend;

public class ScientificCalc extends BasicCalculator implements IScientific {
    @Override
    public void square(int x) {
        System.out.println("Square is :"+(x*x));
    }

    @Override
    public void cube(int x) {
        System.out.println("Cube is :"+(x*x*x));
    }
}
