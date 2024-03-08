package com.voterapp.client;

import com.voterapp.exception.NotEligibleException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

import java.util.Scanner;

public class Voter {
    public static void main(String[] args) throws NotEligibleException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Enter your Locality : ");
        String locality = sc.next();

        System.out.println("Enter your voterId : ");
        int voterId = sc.nextInt();

        IElectionBoothService iElectionBoothService = new
                ElectionBoothServiceImpl();
        try {
            if (iElectionBoothService.checkEligibility(age, locality, voterId))
                System.out.println("You are Eligible to vote");
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
