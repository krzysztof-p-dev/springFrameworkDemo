package com.springframework.myspringapp.repositories;

import com.springframework.myspringapp.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
