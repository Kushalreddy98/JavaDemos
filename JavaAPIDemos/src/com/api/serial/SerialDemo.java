package com.api.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
    public static void main(String[] args) {
        Student student = new Student("Kushal", "AE", 101);
        System.out.println("Serilaizing");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("stud.ser");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        ) {
            objectOutputStream.writeObject(student);
            System.out.println("Completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
