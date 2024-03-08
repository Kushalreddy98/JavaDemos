package com.oops.overriding;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu=new Chinese();
        menu.showItems("starters");
        System.out.println();

        menu=new Indian();
        menu.showItems("lunch");
        System.out.println();
        Chinese chinese = (Chinese) menu;
        chinese.printGames();

    }


}
