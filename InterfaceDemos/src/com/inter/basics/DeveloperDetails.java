package com.inter.basics;

public class DeveloperDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if(type.equals("indoor")){
            System.out.println("Chess and Table Tennis Available");
        }else{
            System.out.println("Football");
        }
    }

    @Override
    public void showActivity() {
        System.out.println("Trip with Developer");
    }
}
