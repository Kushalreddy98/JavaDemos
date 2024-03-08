package com.oops.basics;

public class EmpMain {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Employee employee= new Employee("Kushal",101,2000);
        Employee employee1= new Employee("Manju",102,3000);
        employee.getDetails();
        employee.greet("Employee Name is : ");
        employee1.getDetails();
        employee1.greet("Employee Name is : ");
    }

}
