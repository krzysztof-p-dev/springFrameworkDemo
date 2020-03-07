package com.springframework.myspringapp.repositories;

import com.springframework.myspringapp.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
