package com.inter.basic;

public class Car extends Vehicle implements IAccessories,IExternal,IInternal{
    String type;

    public Car(String brand, String model, double price, String type) {
        super(brand, model, price);
        this.type = type;
    }

    @Override
    public void exterior() {
        System.out.println("Car contains Back Camera");
    }

    @Override
    public void showAccessories() {
        System.out.println("Accessories of cars");
    }

    @Override
    void getMileage() {
        System.out.println("Car mileage is 15kmpl");
    }

    @Override
    public void interior() {
        System.out.println("car contains Sony Music System");
    }
    public void show(){
        if(type.equals("sedan")){
            System.out.println("Car type is Luxury");
        }
        else if (type.equals("suv")){
            System.out.println("Car type is Offroad");
        }
    }
}
