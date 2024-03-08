package com.oops.overriding;

public class Chinese extends Menu{
    @Override

        void showItems(String type){
            if(type.equals("starters")){
                System.out.println("Chicken kabab");
                System.out.println("Chicken 65");
                System.out.println("Chicken tandoori");
            }
            else if(type.equals("lunch")){
                System.out.println("Chicken biryani");
                System.out.println("Mutton biryani");
                System.out.println("Chicken rice");
            }
            else
                System.out.println("Double ka meeta");
        }
        void printGames(){
            System.out.println("Playing Cricket");
        }

    }

