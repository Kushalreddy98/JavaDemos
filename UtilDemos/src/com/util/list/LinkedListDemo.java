package com.util.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("java");
        list.add("Spring");
        list.add("Node");
        list.add("angular");
        list.add("maven");
        System.out.println(list);
        list.addFirst("Html");
        list.addLast("Css");
        list.set(1,"react");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println();
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            String val=iterator.next();
            System.out.println(val);
        }
        System.out.println();
        ListIterator<String> listIterator= list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            String val=listIterator.previous();
            System.out.println(val);
        }
    }
}
