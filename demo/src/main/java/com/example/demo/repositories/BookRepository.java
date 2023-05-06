package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
