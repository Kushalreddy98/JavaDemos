package com.oops.overloading;

public class VarargsDemo {

    void calSum(String name,int... marks) {
        System.out.println("Welcome :" + name);
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
            System.out.println("Sum :" + sum);
        }
    }
        void calSum(String name){
            System.out.println("Hello :"+name);
        }

    public static void main(String[] args) {
        VarargsDemo demo = new VarargsDemo();
        demo.calSum("Kushal",90,89,90);
        System.out.println();
        demo.calSum("Manju",98,99);
        System.out.println();
        demo.calSum("Basava");
    }
    }

