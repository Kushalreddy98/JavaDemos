package com.api.lang;

public class HashDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Mercedes", "amg", "red");
        Vehicle vehicle2 = new Vehicle("Mercedes", "amg", "blue");
        Vehicle vehicle3 = new Vehicle("Audi", "A8", "Green");
        Vehicle vehicle4 = new Vehicle("Mercedes", "amg", "red");
        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle1.equals(vehicle4));
        System.out.println(vehicle2.equals(vehicle3));
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());
    }
}
