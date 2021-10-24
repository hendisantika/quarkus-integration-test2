package com.hendisantika;

import com.hendisantika.resource.LibraryResource;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.35
 */
@QuarkusTest
class LibraryResourceHttpResourceIntegrationTest {

    @TestHTTPEndpoint(LibraryResource.class)
    @TestHTTPResource("book")
    URL libraryEndpoint;

    @Test
    void whenGetBooksByTitle_thenBookShouldBeFound() {
        given().contentType(ContentType.JSON).param("query", "Dune")
                .when().get(libraryEndpoint)
                .then().statusCode(200)
                .body("size()", is(1))
                .body("title", hasItem("Dune"))
                .body("author", hasItem("Frank Herbert"));
    }
}