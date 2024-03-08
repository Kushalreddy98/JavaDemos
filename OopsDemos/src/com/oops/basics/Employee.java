package com.oops.basics;

import org.w3c.dom.ls.LSOutput;

public class Employee {
    String employeeName;
    int employeeId;
    double salary;

    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void getDetails(){
        System.out.println("Name :"+employeeName);
        System.out.println("EmployeeId :"+employeeId);
        System.out.println("EMployee Salary :"+salary);

    }

    String greet(String message){
        return message+" "+employeeName;
    }


}
