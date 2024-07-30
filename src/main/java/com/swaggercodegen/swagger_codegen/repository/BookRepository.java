package com.swaggercodegen.swagger_codegen.repository;

import com.swaggercodegen.swagger_codegen.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
