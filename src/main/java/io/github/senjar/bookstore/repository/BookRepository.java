package io.github.senjar.bookstore.repository;

import java.util.List;
import io.github.senjar.bookstore.model.Book;

public interface BookRepository {

    Book save(Book book);

    List<Book> findAll();
}
