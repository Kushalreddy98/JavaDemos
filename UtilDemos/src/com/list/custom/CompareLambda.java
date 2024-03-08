package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle("City", "Honda", 2002131),
                new Vehicle("AMG", "Mercedes", 3002131),
                new Vehicle("Q7", "Audi", 8002131),
                new Vehicle("Swift", "Maruthi Suzuki", 1002131),
                new Vehicle("Fortuner", "Toyota", 9002131)
        );
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);
        System.out.println();
        Collections.sort(vehicles,(o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);
        System.out.println();
        Collections.sort(vehicles,(o1, o2) -> o1.getModel().compareTo(o2.getModel()));
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);
        System.out.println();
        Collections.sort(vehicles,(o1, o2) ->{
            return ((Double)o1.getPrice()).compareTo(o2.getPrice());
        });
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);
    }
}
