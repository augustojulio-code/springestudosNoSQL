package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Book;
import com.example.demo.services.BookServiceImp;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookServiceImp bookServiceImp;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAll() {

        return ResponseEntity.ok().body(bookServiceImp.getAll());
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getById(@PathVariable String id) {
        return ResponseEntity.ok().body(bookServiceImp.getById(id));
    }

    @PostMapping("/books")
    public ResponseEntity<Book> create(@RequestBody Book book) {
        return ResponseEntity.ok().body(bookServiceImp.create(book));
    }

    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Book book) {
        return ResponseEntity.ok().body(bookServiceImp.update(book));
    }

}
