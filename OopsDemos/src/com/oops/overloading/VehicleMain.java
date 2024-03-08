package com.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle("BMW");
        vehicle.getDetails();
        System.out.println();
        Vehicle vehicle1 = new Vehicle("Mercedes", "AMG");
        vehicle1.getDetails();
        System.out.println();
        Vehicle vehicle2 = new Vehicle("Ferrari", "F1", 6204532);
        vehicle2.getDetails();
    }
}
