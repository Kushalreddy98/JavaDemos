package com.bookapp.repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDb;
import com.bookapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BookRepositoryImpl implements IBookRepository {

    @Override
    public void addByBook(Book book) {

        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setString(4, book.getCategory());
            statement.setDouble(3, book.getPrice());
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

            statement.setDouble(1, price);
            statement.setInt(2, bookId);

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    @Override
    public void deleteBook(int bookId) {
        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);
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
        Book book = null;

        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.SELECTBYIDQUERY);
        ) {
            statement.setInt(1, bookId);
            try (ResultSet set = statement.executeQuery();) {
                while (set.next()) {
                    Integer book_id = set.getInt("book_Id");
                    String title = set.getString("title");
                    String author = set.getString("author");
                    String category = set.getString("category");
                    Double price = set.getDouble("price");
                    book = new Book(book_id, title, author, category, price);
                }

            }

        } catch (SQLException e) {
            throw new IdNotFoundException("Book Id doesn't Exist");
        }
        return book;
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.SELECTQUERY);
             ResultSet set = statement.executeQuery();
        ) {
            while (set.next()) {

                Integer book_id = set.getInt("book_Id");
                String title = set.getString("title");
                String author = set.getString("author");
                String category = set.getString("category");
                Double price = set.getDouble("price");
                Book book = new Book(book_id, title, author, category, price);
                books.add(book);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public List<Book> findByAuthor(String author) throws BookNotFoundException {
        List<Book> books = new ArrayList<>();
        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.SELECTBYAUTHORQUERY);
        ) {
            statement.setString(1,author);
            try (ResultSet set = statement.executeQuery();) {
                while (set.next()) {
                    Book book = new Book();
                    book.setBookId(set.getInt("book_Id"));
                    book.setTitle(set.getString("title"));
                    book.setAuthor(set.getString("author"));
                    book.setCategory(set.getString("category"));
                    book.setPrice(set.getDouble("price"));
                    books.add(book);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    public List<Book> findByCategory(String category) throws BookNotFoundException {
        List<Book> books = new ArrayList<>();
        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.SELECTBYCATQUERY);
        ) {
            statement.setString(1, category);
            try (ResultSet set = statement.executeQuery();) {
                while (set.next()) {
                    Book book = new Book();
                    book.setBookId(set.getInt("book_Id"));
                    book.setTitle(set.getString("title"));
                    book.setAuthor(set.getString("author"));
                    book.setCategory(set.getString("category"));
                    book.setPrice(set.getDouble("price"));
                    books.add(book);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
        List<Book> books = new ArrayList<>();
        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.SELECTBYPRICEQUERY);
        ) {
            statement.setDouble(1, price);
            try (ResultSet set = statement.executeQuery();) {
                while (set.next()) {
                    Book book = new Book();
                    book.setBookId(set.getInt("book_Id"));
                    book.setTitle(set.getString("title"));
                    book.setAuthor(set.getString("author"));
                    book.setCategory(set.getString("category"));
                    book.setPrice(set.getDouble("price"));
                    books.add(book);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException {
        List<Book> books = new ArrayList<>();
        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.SELECTBYAUTHCATQUERY);
        ) {
            statement.setString(1, author);
            statement.setString(2, category);
            try (ResultSet set = statement.executeQuery();) {
                while (set.next()) {
                    Book book = new Book();
                    book.setBookId(set.getInt("book_Id"));
                    book.setTitle(set.getString("title"));
                    book.setAuthor(set.getString("author"));
                    book.setCategory(set.getString("category"));
                    book.setPrice(set.getDouble("price"));
                    books.add(book);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}