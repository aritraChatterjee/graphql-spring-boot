package edu.aritra.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;

import edu.aritra.graphql.model.Author;
import edu.aritra.graphql.model.Book;
import edu.aritra.graphql.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private final AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findOne(book.getAuthor().getId());
    }
}
