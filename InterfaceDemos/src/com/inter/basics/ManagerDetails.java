package com.inter.basics;

public class ManagerDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if(type.equals("indoor")){
            System.out.println("Carrom and shuttle Tennis Available");
        }else{
            System.out.println("Cricket");
        }
    }

    @Override
    public void showActivity() {
        System.out.println("Weekly trip with Manager");
    }
}
