package com.hendisantika;

import com.hendisantika.service.LibraryService;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectSpy;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.mockito.Mockito.verify;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.37
 */
@QuarkusTest
class LibraryResourceInjectSpyIntegrationTest {

    @InjectSpy
    LibraryService libraryService;

    @Test
    void whenGetBooksByAuthor_thenBookShouldBeFound() {
        given().contentType(ContentType.JSON).param("query", "Asimov")
                .when().get("/library/book")
                .then().statusCode(200);

        verify(libraryService).find("Asimov");
    }
}
