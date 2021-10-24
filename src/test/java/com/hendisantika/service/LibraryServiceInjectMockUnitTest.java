package com.hendisantika.service;

import com.hendisantika.repository.BookRepository;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

import javax.inject.Inject;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.28
 */
@QuarkusTest
class LibraryServiceInjectMockUnitTest {

    @Inject
    LibraryService libraryService;

    @InjectMock
    BookRepository bookRepository;
}
