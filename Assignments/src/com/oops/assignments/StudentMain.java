package com.oops.assignments;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of students");
        int numOfStudent=sc.nextInt();
        for(int i=0;i<numOfStudent;i++) {
            System.out.println("Enter Student Name");
            String name = sc.next();
            System.out.println("Enter Student Department");
            String department = sc.next();
            System.out.println("Enter No of subjects");
            int numOfSubject=sc.nextInt();
            System.out.println("Enter Student Marks");
            int[] marks=new int[numOfSubject];
            for(int j=0;j<numOfSubject;j++){
                marks[j]=sc.nextInt();
            }
            Student student = new Student(name, department);
            student.printDetails();
            System.out.println(student.getGrades(marks));
        }
    }
}
