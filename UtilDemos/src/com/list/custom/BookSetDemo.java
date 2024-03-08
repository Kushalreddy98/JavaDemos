package com.list.custom;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> books= Arrays.asList(
                new Book("java","james",2000),
                new Book("java","james",2000),
                new Book("python","robin",5000),
                new Book("mysql","kathy",6000),
                new Book("spring","kathy",2000)
        );
        System.out.println("List Book");
        for (Book book:books)
            System.out.println(book);
        System.out.println("Set Book");
        Set<Book> bookSet=new LinkedHashSet<>(books);
        for (Book book:bookSet)
            System.out.println(book);
    }
}
