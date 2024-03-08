package com.oops.overloading;

public class OverLoading {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.calcArea(10);
        shape.calcArea(2.0);
        int rect= shape.calcArea(10,20);
        System.out.println(rect);
        double tri=shape.calcArea(20.0,30);
        System.out.println(tri);
    }
}
