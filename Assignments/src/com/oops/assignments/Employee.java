package com.oops.assignments;

public class Employee {
    String name,designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    double calcBonus(double basicAllowance){
        return basicAllowance;
    }
    double calcBonus(double basicAllowance,double houseAllowance,String gift){
        System.out.println("The gift is :"+gift);
        return  basicAllowance+ houseAllowance;
    }
    double calcBonus(double basicAllowance,String gift,double houseAllowance,double carAllowance){
        System.out.println("The gift is :"+gift);
        return  basicAllowance+houseAllowance+carAllowance;
    }
}
