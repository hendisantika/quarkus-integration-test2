package com.hendisantika.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.29
 */
@QuarkusTest
class LibraryServiceIntegrationTest {

    @Inject
    LibraryService libraryService;

    @Test
    void whenFindByAuthor_thenBookShouldBeFound() {
        assertFalse(libraryService.find("Frank Herbert").isEmpty());
    }
}

