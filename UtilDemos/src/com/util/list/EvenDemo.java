package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,21,33,25,16,27);
        List<Integer> evenNumbers= new ArrayList<>();
        for(Integer number:numbers){
            if(number%2==0){
                evenNumbers.add(number);
            }
        }
        for(Integer evenNumber:evenNumbers){
            System.out.println(evenNumber);
        }
    }
}
