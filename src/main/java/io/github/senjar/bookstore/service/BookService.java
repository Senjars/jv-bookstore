package io.github.senjar.bookstore.service;

import java.util.List;

import io.github.senjar.bookstore.model.Book;

public interface BookService {

    Book save(Book book);

    List<Book> findAll();
}
