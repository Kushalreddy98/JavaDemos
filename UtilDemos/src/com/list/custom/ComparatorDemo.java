package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles= Arrays.asList(
             new Vehicle("City","Honda",2002131),
             new Vehicle("AMG","Mercedes",3002131),
             new Vehicle("Q7","Audi",8002131),
             new Vehicle("Swift","Maruthi Suzuki",1002131),
             new Vehicle("Fortuner","Toyota",9002131)
        );
        System.out.println("Before Sorting");
        for(Vehicle vehicle:vehicles)
            System.out.println(vehicle);
        System.out.println();
        System.out.println("Sort by brand");
        Collections.sort(vehicles,new BrandSort());
        for(Vehicle vehicle:vehicles)
            System.out.println(vehicle);
        System.out.println();
        System.out.println("Sort by model");
        Collections.sort(vehicles,new ModelSort());
        for(Vehicle vehicle:vehicles)
            System.out.println(vehicle);
        System.out.println();
        System.out.println("Sort by Price");
        Collections.sort(vehicles,new PriceSort());
        for(Vehicle vehicle:vehicles)
            System.out.println(vehicle);
    }
}
