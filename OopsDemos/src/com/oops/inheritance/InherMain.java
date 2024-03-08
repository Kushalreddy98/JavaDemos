package com.oops.inheritance;

public class InherMain {

    public static void main(String[] args) {
        InEmployee inEmployee = new InEmployee("Kushal",101);
        System.out.println("1st");
        inEmployee.getDetails();
        System.out.println();

        InManager inManager = new InManager("Manju",102,2000);
        System.out.println("2nd");
        inManager.getDetails();
        inManager.printBonus(2000);
    }
}
