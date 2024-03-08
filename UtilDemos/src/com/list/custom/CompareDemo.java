package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        List<Book> books=Arrays.asList(
                new Book("java","james",2000),
                new Book("python","robin",5000),
                new Book("mysql","kathy",6000),
                new Book("spring","kathy",2000)
        );
        System.out.println("Before Sorting");
           for(Book book:books)
               System.out.println(book);
        System.out.println();
        System.out.println("After Sorting");
        Collections.sort(books);
        for(Book book:books)
            System.out.println(book);
    }
}
