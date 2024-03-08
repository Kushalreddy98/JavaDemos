package com.util.list;

import java.util.ArrayList;
import java.util.List;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        List<String> fruitsWithM = new ArrayList<>();
        System.out.println(fruitsWithM.size());
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Cheeku");
        fruits.add("Muskmelon");
        fruits.add("Watermelon");
        fruits.add("Mango");
        for(String fruit:fruits){
            if(fruit.contains("M")){
                fruitsWithM.add(fruit);
            }
        }
        for(String fruitWithM:fruitsWithM)
            System.out.println(fruitWithM);
    }
}
