package com.inter.basics;

public class InterMain {
    public static void main(String[] args) {
        IEntertainment iEntertainment=new ManagerDetails();
        iEntertainment.showGames("indoor");
        iEntertainment.showActivity();
        System.out.println();
        iEntertainment=new DeveloperDetails();
        iEntertainment.showGames("indoor");
        iEntertainment.showActivity();
    }
}
