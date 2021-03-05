package edu.aritra.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import edu.aritra.graphql.model.Author;
import edu.aritra.graphql.model.Book;
import edu.aritra.graphql.repository.AuthorRepository;
import edu.aritra.graphql.repository.BookRepository;

public class Query implements GraphQLQueryResolver {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }

    public long countAuthors() {
        return authorRepository.count();
    }
}
