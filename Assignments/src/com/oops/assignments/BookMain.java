package com.oops.assignments;

public class BookMain {
    public static void main(String[] args) {
        Book book=new Book("java","james",20123,"tech");
        book.getDetails();
        Book book1=new Book("sql","john",113,"Tech");
        book1.getDetails();
        book1.checkBookType();
    }

}
