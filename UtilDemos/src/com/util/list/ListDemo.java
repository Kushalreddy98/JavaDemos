package com.util.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        System.out.println(list.size());
        System.out.println();
        list.add("java");
        list.add("100.0");
        list.add("spring");
        list.add("Angular");
        list.add("Maven");
        list.add(1, "Halen");
        System.out.println(list);
        list.set(2, "Kushal");
        System.out.println();
        System.out.println(list.size());
        System.out.println();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println();
        System.out.println("Printing in reverse order");
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            System.out.println(str);
        }
        System.out.println(",,..,.,.");
        System.out.println("Sorting the List");
        Collections.sort(list);
        for (String val : list)
            System.out.println(val.toUpperCase());
    }
}
