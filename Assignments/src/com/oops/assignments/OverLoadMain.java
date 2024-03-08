package com.oops.assignments;

import java.util.Scanner;

public class OverLoadMain {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Employee[] empList=new Employee[4];
       // Employee employee=new Employee("Kushal","Trainee");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< empList.length;i++) {
            String name = sc.next();
            String designation = sc.next();
            empList[i] = new Employee(name, designation);
        }
            System.out.println("Enter the designation");
            String choice=sc.next();

       /* Employee emp=new Employee("Kushal","programer");
        String designation="0";
            if (designation.equals("programmer"))
                System.out.println( emp.calcBonus(2000));
            else if (designation.equals("manager"))
                emp.calcBonus(2000, 200, "car");
            else
                emp.calcBonus(2000, "laptop", 400, 500);*/

        }
    }




