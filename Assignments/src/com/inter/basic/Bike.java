package com.inter.basic;

public class Bike extends Vehicle implements IExternal{
    String capacity;
    public Bike(String brand, String model, double price,String capacity) {
        super(brand, model, price);
        this.capacity=capacity;
    }

    @Override
    public void showAccessories() {
        System.out.println("Accessories of bikes");
    }

    @Override
    public void exterior() {
        System.out.println("Bike contains windshield");
    }

    @Override
    void getMileage() {
        System.out.println("Bike mileage is 25kmpl");
    }
    void showType(){
        if(capacity.equals("1000cc")) {
            System.out.println("Race Bike");
        }
        else if(capacity.equals("650cc")) {
            System.out.println("Offroad Bike");
        }
        else if(capacity.equals("250cc")) {
            System.out.println("Normal Bike");
        }
        else
            System.out.println("not a Bike");
    }
}
