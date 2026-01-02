package io.github.senjar.bookstore.service;

import io.github.senjar.bookstore.model.Book;
import java.util.List;

public interface BookService {

    Book save(Book book);

    List<Book> findAll();
}
