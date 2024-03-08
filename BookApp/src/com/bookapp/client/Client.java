package com.bookapp.client;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookserviceImpl;
import com.bookapp.service.IBookService;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book name");
        String name=sc.next();
        IBookService iBookService = new BookserviceImpl();
        List<Book> booksByCategory;
        try {
            System.out.println("Enter the book category");
            String category=sc.next();
            booksByCategory=iBookService.getByCategory(category);
            for(Book book:booksByCategory)
                System.out.println(book);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Book by Author");
        System.out.println("Enter the book author");
        String author=sc.next();
        try {
            List<Book> getByAuthor = iBookService.getByAuthorStartsWith(author);
            for(Book book:getByAuthor)
                System.out.println(book);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Book by Price");
        System.out.println("Enter the book Price");
        double price=sc.nextInt();
        try {
            List<Book> bookByPriceLessThan = iBookService.getByAuthorStartsWith(author);
            for(Book book:bookByPriceLessThan)
                System.out.println(book);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Book by Author");
        System.out.println("Enter the book category");
        String authorAndCategory=sc.next();
        try {
            List<Book> getByAuthorContainsAndCategory = iBookService.getByAuthorStartsWith(author);
            for(Book book:getByAuthorContainsAndCategory)
                System.out.println(book);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
    }
}
