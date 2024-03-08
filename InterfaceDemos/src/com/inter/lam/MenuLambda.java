package com.inter.lam;
public class MenuLambda {
    public static void main(String[] args) {
        IMenu menu = () -> {
            System.out.println("Food is chinese");
            System.out.println("1.noodle" + " "+
                    "2.momos");
        };
        menu.showMenus();
        System.out.println(); 
        menu = () -> {
            System.out.println("Food is Italian");
            System.out.println("1.Italian" + " "+
                    "2.momos");
        };
        menu.showMenus();
        System.out.println();
        menu = () -> {
            System.out.println("Food is Indian");
            System.out.println("1.Veg meals" +" "+
                    "2.Rice samber");
        };
        menu.showMenus();

    }
}
