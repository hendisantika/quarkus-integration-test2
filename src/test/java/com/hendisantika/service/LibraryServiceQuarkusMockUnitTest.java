package com.hendisantika.service;

import com.hendisantika.model.Book;
import com.hendisantika.repository.BookRepository;
import io.quarkus.test.junit.QuarkusMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.inject.Inject;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.30
 */
@QuarkusTest
class LibraryServiceQuarkusMockUnitTest {

    @Inject
    LibraryService libraryService;

    @BeforeEach
    void setUp() {
        BookRepository mock = Mockito.mock(TestBookRepository.class);
        Mockito.when(mock.findBy("Asimov"))
                .thenReturn(Arrays.stream(new Book[]{
                        new Book("Foundation", "Isaac Asimov"),
                        new Book("I Robot", "Isaac Asimov")}));
        QuarkusMock.installMockForType(mock, BookRepository.class);
    }

    @Test
    void whenFindByAuthor_thenBooksShouldBeFound() {
        assertEquals(2, libraryService.find("Asimov").size());
    }
}


