package com.util.set;

import java.util.*;

public class HashDemo {
    public static void main(String[] args) {
//        Set<String> hashSet = new HashSet<>();
        Set<String> hashSet = new LinkedHashSet<>();

     //   Set<String> hashSet = new TreeSet<>();
        hashSet.add("Apple");
        hashSet.add("Pineapple");
        hashSet.add("Orange");
        hashSet.add("Banana");
        hashSet.add("Kiwi");
        hashSet.add("100");
        hashSet.add(null);
        System.out.println(hashSet);
        for (String element : hashSet)
            System.out.println(element);


        List<String> friuts=Arrays.asList("apple","banana","orange","apple");
        Set<String> newFruits = new HashSet<>(friuts);
        System.out.println(newFruits);
    }
}
