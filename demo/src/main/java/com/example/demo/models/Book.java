package com.example.demo.models;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Id;
import lombok.Data;

@Document("Books")
@Data
public class Book {
    @Id
    private Long id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Price")
    private BigDecimal price;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("Author")
    private String author;
}
