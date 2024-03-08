package com.oops.bean;

public class Vehicle {
    private String model;
    private String brand;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                ",brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
