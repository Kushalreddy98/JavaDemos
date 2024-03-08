package com.bookapp.repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDb;
import com.bookapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BookRepositoryImpl implements IBookRepository {

    @Override
    public void addBook(Book book) {

        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setDouble(3, book.getPrice());
            statement.setString(4, book.getCategory());
            statement.setInt(5, book.getBookId());
            statement.execute();
            boolean result = statement.execute();
            System.out.println(result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void updateBook(int bookId, double price) {
        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);
        ) {

            statement.setDouble(2, price);
            statement.setInt(1, bookId);

            boolean result = statement.execute();
            System.out.println(result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    @Override
    public void deleteBook(int bookId) {
        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);
        ) {
            statement.setInt(1, bookId);
            boolean result = statement.execute();
            System.out.println(result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public Book findById(int bookId) throws IdNotFoundException {
        throw new IdNotFoundException("Book Id doesn't Exist");
    }


    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();

     return books;
    }

    @Override
    public List<Book> findByAuthor(String author) throws BookNotFoundException {
        List<Book> bookByAuthor = new ArrayList<>();

        return bookByAuthor;
    }
    public List<Book> findByCategory(String category) throws BookNotFoundException {
        List<Book> bookByCategory=new ArrayList<>();

        return bookByCategory;
    }

    @Override
    public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
        List<Book> bookByLesserPrice=new ArrayList<>();
        return bookByLesserPrice;
    }

    @Override
    public List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException {
        List<Book> bookByAuthAndCat=new ArrayList<>();
        return bookByAuthAndCat;
}
    }