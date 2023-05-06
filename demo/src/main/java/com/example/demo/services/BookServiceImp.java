package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookServiceImp implements BookServices {

    @Autowired
    private BookRepository repository;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Book create(Book book) {
        return repository.save(book);
    }

    @Override
    public Boolean delete(String id) {
        Optional<Book> book = repository.findById(id);
        if (book.isPresent()) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public List<Book> getAll() {
        return repository.findAll();
    }

    @Override
    public Book getById(String id) {
        Optional<Book> book = repository.findById(id);
        if (book.isPresent()) {
            return book.get();
        }

        return null;
    }

    @Override
    public Boolean update(Book book) {

        return null;
    }

}
