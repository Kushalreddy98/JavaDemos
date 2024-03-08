package com.inter.basic;

public abstract class Vehicle implements IInsurance {
    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void getDetails() {
        System.out.println("Brand is :" + brand);
        System.out.println("model is :" + model);
        System.out.println("price is :" + price);
    }

    abstract void getMileage();

    @Override
    public void insuranceDetails() {
        System.out.println("Insurance name is Star");
    }


}
