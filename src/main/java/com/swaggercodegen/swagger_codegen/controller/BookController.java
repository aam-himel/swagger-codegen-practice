package com.swaggercodegen.swagger_codegen.controller;


import io.swagger.api.BookApi;
import io.swagger.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController implements BookApi {

    @Override
    public ResponseEntity<Book> createNewBook(Book body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteBook(String id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setTitle("book 1");
        book1.setAvailability(false);
        book1.setPrice(new BigDecimal("234.33"));
        book1.setId(334L);

        Book book2 = new Book();
        book2.setTitle("book 2");
        book2.setAvailability(true);
        book2.setPrice(new BigDecimal("150.00"));
        book2.setId(335L);

        Book book3 = new Book();
        book3.setTitle("book 3");
        book3.setAvailability(true);
        book3.setPrice(new BigDecimal("199.99"));
        book3.setId(336L);

        Book book4 = new Book();
        book4.setTitle("book 4");
        book4.setAvailability(false);
        book4.setPrice(new BigDecimal("299.99"));
        book4.setId(337L);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> getBookDetails(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Book> updateBookDetails(String id, Book body) {
        return null;
    }
}
