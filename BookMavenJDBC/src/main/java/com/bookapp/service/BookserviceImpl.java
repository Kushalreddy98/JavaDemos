package com.bookapp.service;


import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.BookRepositoryImpl;
import com.bookapp.repository.IBookRepository;

import java.util.List;

public class BookserviceImpl implements IBookService {
        private IBookRepository repository=new BookRepositoryImpl();
    @Override
    public void addBook(Book book) {
        repository.addBook(book);
    }

    @Override
    public void updateBook(int bookId, double price) {
        repository.updateBook(bookId,price);
    }

    @Override
    public void deleteBook(int bookId) {
        repository.deleteBook(bookId);
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        repository.findByAuthor(author);
        return null;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        return null;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        return null;
    }
}