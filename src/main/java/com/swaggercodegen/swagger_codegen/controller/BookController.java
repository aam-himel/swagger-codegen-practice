package com.swaggercodegen.swagger_codegen.controller;


import com.swaggercodegen.swagger_codegen.model.Book;
import com.swaggercodegen.swagger_codegen.service.BookService;
import io.swagger.api.BookApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class BookController implements BookApi {
    @Autowired
    BookService bookService;
    @Override
    public ResponseEntity<Book> createNewBook(Book body) {
        System.out.println("book"+body);
        return ResponseEntity.ok(bookService.save(body));
    }

    @Override
    public ResponseEntity<Void> deleteBook(Long id) {
        if (id <= 0) {
            return ResponseEntity.badRequest().build();
        }

        if (bookService.existsById(id)) {
            bookService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    @Override
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.findAll());
    }

    @Override
    public ResponseEntity<Book> getBookDetails(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Book> updateBookDetails(Long id, Book body) {
        return null;
    }

}
