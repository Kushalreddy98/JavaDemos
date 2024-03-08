package com.oops.overriding;

public class Indian extends Menu{
    @Override
    void showItems(String type){
        if(type.equals("breakfast")){
            System.out.println("Idly");
            System.out.println("Dosa");
            System.out.println("Poori");
        }
        else if(type.equals("lunch")){
            System.out.println("South Indian meals");
            System.out.println("North Indian meals");
            System.out.println("Rice and Samber");
        }
        else
            System.out.println("Black Current IceCream");
    }

}
