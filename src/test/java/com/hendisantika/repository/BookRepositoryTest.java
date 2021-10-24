package com.hendisantika.repository;

import com.hendisantika.util.QuarkusTransactionalTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.23
 */
@QuarkusTransactionalTest
class BookRepositoryIntegrationTest {

    @Inject
    BookRepository bookRepository;

    @Test
    void givenBookInRepository_whenFindByAuthor_thenShouldReturnBookFromRepository() {
        assertTrue(bookRepository.findBy("Herbert").findAny().isPresent());
    }

}
