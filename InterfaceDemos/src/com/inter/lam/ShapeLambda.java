package com.inter.lam;

public class ShapeLambda {
    public static void main(String[] args) {
        IShape shape=(int x,int y)->{
            System.out.println("Area of rectangle is "+(x*y));
        };
        shape.area(10,20);
        System.out.println();
        shape=(int x,int y)-> System.out.println("2nd Area of rectangle is "+(x*y));
        shape.area(60,20);
        System.out.println();
        IShape shape1=(int x,int y)->{
            System.out.println("Area of Triangle "+(.5*x*y));
        };
        shape1.area(20,30);
        System.out.println();
        shape1=(int x,int y)-> System.out.println("2nd Area of Triangle is "+(.5*x*y));
        shape1.area(40,30);
    }
}
