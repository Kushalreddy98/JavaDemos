package com.util.maps;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> map = new HashMap<>();
        map.put(new Department("Raju", 1, "AE"),
                Arrays.asList(new Student("Kushal", "Kolar"),
                        new Student("ram", "Mysore"),
                        new Student("Manju", "Hoskote")));

        map.put(new Department("Ramu", 2, "CES"),
                Arrays.asList(new Student("Hemu", "Mandya"),
                        new Student("Nithin", "Kadapa"),
                        new Student("Basava", "Gangavathi")));

        map.put(new Department("Rani", 3, "ECE"),
                Arrays.asList(new Student("Sandhya", "Hindupur"),
                        new Student("Sravani", "Nellore"),
                        new Student("Chandana", "Rajamundry")));

        Set<Department> departments = map.keySet();
        for (Department department : departments) {
            System.out.println();
            System.out.println("Department Head is " + department.getDeptHead());
            List<Student> students = map.get(department);
            for (Student student : students) {
                System.out.println("Students are :" + student.getStudName());
                System.out.println("Students city is :" + student.getCity());
            }
        }
    }
}
