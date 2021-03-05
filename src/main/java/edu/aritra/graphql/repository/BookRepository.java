package edu.aritra.graphql.repository;

import org.springframework.data.repository.CrudRepository;

import edu.aritra.graphql.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
