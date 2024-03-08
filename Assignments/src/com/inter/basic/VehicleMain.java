package com.inter.basic;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car("Mercedes","AMG",250300,"sedan");
        car.getDetails();
        car.getMileage();
        car.insuranceDetails();
        System.out.println();

        Car ncar =(Car) car;
        ncar.show();
        ncar.interior();
        ncar.showAccessories();
        ncar.exterior();
        System.out.println();

        Vehicle bike = new Bike("Hero","splender",50300,"250cc");
        bike.getDetails();
        bike.getMileage();
        bike.insuranceDetails();
        System.out.println();

        Bike bike1=(Bike) bike;
        bike1.showType();
        bike1.showAccessories();
        bike1.exterior();
    }
}
