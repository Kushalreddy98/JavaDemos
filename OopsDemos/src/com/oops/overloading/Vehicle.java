package com.oops.overloading;

public class Vehicle {
    String brand,model;
    double price;

    public Vehicle() {
        System.out.println("default");
    }

    public Vehicle(String brand) {
        this();
        System.out.println("one");
        this.brand = brand;
    }

    public Vehicle(String brand, String model) {
        this(brand);
        System.out.println("two");
        this.model = model;
    }

    public Vehicle(String brand, String model, double price) {
        this(model,brand);
        System.out.println("three");
        this.price = price;
    }
    void getDetails(){
        if(brand!=null)
        System.out.println("Car brand is: "+brand);
        if(model!=null)
        System.out.println("Car model is: "+model);
        if(price>0)
        System.out.println("Car price is: "+price);
    }
}
