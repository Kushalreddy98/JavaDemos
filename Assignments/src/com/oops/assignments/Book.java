package com.oops.assignments;

public class Book {
    String title,author,category;
    double price;
    Book(String title,String author,double price,String category){
        this.title=title;
        this.author=author;
        this.price=price;
        this.category=category;
    }
    void getDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println(category);
    }
    void checkBookType(){
        if(price>500){
            System.out.println("Premium Books");
        }else{
            System.out.println("Standard Book");
        }
    }
}
