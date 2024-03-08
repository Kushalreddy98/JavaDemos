package com.inter.lam;

public class Waiter implements IMenu{
    void availableItems(IMenu menu){
        System.out.println("Welcome to Hotel");
        menu.showMenus();
        System.out.println("Order now");
    }

    @Override
    public void showMenus() {
        System.out.println("Chinese Menu");
        System.out.println("Italian Menu");
        System.out.println("Indian Menu");
    }
}
