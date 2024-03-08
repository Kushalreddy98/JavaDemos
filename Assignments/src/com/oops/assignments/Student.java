package com.oops.assignments;

public class Student {
    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void printDetails() {
        System.out.println("Student name is :" + name);
        System.out.println("Student department is :" + department);
    }

    String getGrades(int... marks) {
        int sum = 0;
        for (int mark:marks) {
            sum+=mark;
        }
        int average = sum/marks.length;
        System.out.println(sum);
        System.out.println(average);
        String grade=null;
        if (average >= 90)
            grade="A";
        else if (average >= 80 && average < 90)
            grade="B";
        else if (average >= 70 && average < 80)
            grade="C";
        else if (average >= 60 && average < 70)
            grade="D";
        else if (average >= 50 && average < 60)
            grade="E";
        else
            grade="Fail";

        return grade;
    }
}
