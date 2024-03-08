package com.util.maps;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//        Map<Integer,String> hashmap=new HashMap<>();
        Map<Integer,String> hashmap=new LinkedHashMap<>();
//        Map<Integer,String> hashmap=new TreeMap<>();
        hashmap.put(1,"java");
        hashmap.put(10,"Spring");
        hashmap.put(8,"node");
        hashmap.put(null,"css");
        hashmap.put(5,"html");
        hashmap.put(1,"react");
        hashmap.put(100,null);
        hashmap.put(101,null);
        System.out.println(hashmap);

        System.out.println(hashmap.get(1));
        System.out.println(hashmap.get(102));
        System.out.println(hashmap.getOrDefault(102,"jsp"));
        System.out.println(hashmap.containsKey(1));
        hashmap.values();

        System.out.println();
        Set<Integer> keys=hashmap.keySet();
        for(Integer key :keys) {
            System.out.println(key+" "+hashmap.get(key));
        }
        System.out.println();
        System.out.println("Using entry Set");
        Set<Map.Entry<Integer,String>> entries=hashmap.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

    }
}
