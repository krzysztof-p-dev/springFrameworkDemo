package com.springframework.myspringapp.repositories;

import com.springframework.myspringapp.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
