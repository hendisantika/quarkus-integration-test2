package com.hendisantika.service;

import com.hendisantika.model.Book;
import com.hendisantika.repository.BookRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.08
 */
@Transactional
@ApplicationScoped
public class LibraryService {

    @Inject
    BookRepository bookRepository;

    public Set<Book> find(String query) {
        if (query == null) {
            return bookRepository.findAll().stream().collect(toSet());
        }

        return bookRepository.findBy(query).collect(toSet());
    }
}
