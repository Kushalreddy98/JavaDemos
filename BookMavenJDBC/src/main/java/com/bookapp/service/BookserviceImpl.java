package com.bookapp.service;


import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.BookRepositoryImpl;
import com.bookapp.repository.IBookRepository;

import java.util.List;

public class BookserviceImpl implements IBookService {
    private IBookRepository repository = new BookRepositoryImpl();

    @Override
    public void addBook(Book book) {
        repository.addByBook(book);
    }

    @Override
    public void updateBook(int bookId, double price) {
        repository.updateBook(bookId, price);
    }

    @Override
    public void deleteBook(int bookId) {
        repository.deleteBook(bookId);
    }

    @Override
    public List<Book> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> bookList = repository.findByAuthor(author);
        if(bookList.isEmpty())
            throw new BookNotFoundException("Book not Found");
        return bookList;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> bookList = repository.findByCategory(category);
        if (bookList.isEmpty())
            throw new BookNotFoundException("Book not found");
        return bookList;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> bookList = repository.findByLesserPrice(price);
        if (bookList.isEmpty())
            throw new BookNotFoundException("Book not found");
        return bookList;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> bookList = repository.findByAuthorCategory(author, category);
        if (bookList.isEmpty())
            throw new BookNotFoundException("Book with this category not found");
        return bookList;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        Book book = repository.findById(bookId);
        if (book == null)
            throw new IdNotFoundException("Book not found with this id");
        return book;
    }
}