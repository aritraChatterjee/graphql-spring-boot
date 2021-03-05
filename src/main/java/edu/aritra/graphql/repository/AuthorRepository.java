package edu.aritra.graphql.repository;

import org.springframework.data.repository.CrudRepository;

import edu.aritra.graphql.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
