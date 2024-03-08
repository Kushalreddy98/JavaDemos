package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        IShape shape = new Rectangle();
        factory.printArea(shape,10,20);
        System.out.println();
        factory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Calculating Tri Area");
                System.out.println("Tri "+(.5*x*y));
            }
        }, 10, 20);
        System.out.println("........");
        factory.printArea((int x,int y)->{
            System.out.println("Calculating Square Area");
            System.out.println("Square"+(x*y));
        },20,30);

    }
}
