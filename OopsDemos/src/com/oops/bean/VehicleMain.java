package com.oops.bean;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Mercedes");
        vehicle.setModel("AMG");
        vehicle.setPrice(210500);
        System.out.println(vehicle.toString());
    }
}
