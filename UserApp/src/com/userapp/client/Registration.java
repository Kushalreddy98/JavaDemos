package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String username = sc.next();
        IValidationService service = new ValidationServiceImpl();

        try {
            if (service.validateUsername(username)) {
                System.out.println("You are not Registered");
                System.out.println("your UserName is "+username+"01");
                System.out.println("Enter Password");
                String password=sc.next();
                if(service.validatePassword(password))
                    System.out.println("Welcome "+username+" You are Registered");
            }
        } catch (NameExistsException n) {
            System.out.println(n.getMessage());
        } catch (TooLongException |TooShortException e) {
            System.out.println(e.getMessage());
        }
    }
}
