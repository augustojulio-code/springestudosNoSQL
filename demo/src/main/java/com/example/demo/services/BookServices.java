package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Book;

public interface BookServices {

    Book create(Book book);

    Boolean delete(String id);

    List<Book> getAll();

    Book getById(String id);

    Boolean update(Book book);
}
