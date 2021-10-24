package com.hendisantika.service;

import com.hendisantika.model.Book;
import com.hendisantika.repository.BookRepository;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.BeforeEach;

import javax.inject.Inject;
import java.util.Arrays;

import static org.mockito.Mockito.when;

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

    @BeforeEach
    void setUp() {
        when(bookRepository.findBy("Frank Herbert"))
                .thenReturn(Arrays.stream(new Book[]{
                        new Book("Dune", "Frank Herbert"),
                        new Book("Children of Dune", "Frank Herbert")}));
    }
}
