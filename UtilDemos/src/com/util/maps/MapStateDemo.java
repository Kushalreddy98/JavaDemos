package com.util.maps;

import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap = new HashMap<>();
        stateMap.put("Karnataka", Arrays.asList("Bangalore", "Mysore", "kolar"));
        stateMap.put("TamilNadu", Arrays.asList("Chennai", "Vellore", "Salem"));
        stateMap.put("Andra Pradesh", Arrays.asList("Vizag", "kadapa", "kurnool"));
        stateMap.put("Kerala", Arrays.asList("waynad", "munnar", "kannur"));
        Set<String> states = stateMap.keySet();
        for (String state : states) {
            System.out.println();
            System.out.println("State = "+state);
            List<String> cities = stateMap.get(state);
            for (String city : cities) {
                System.out.println("Cities are :" + city);
            }
        }

    }
}
