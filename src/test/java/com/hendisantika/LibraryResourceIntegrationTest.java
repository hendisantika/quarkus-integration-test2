package com.hendisantika;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

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
 * Time: 21.37
 */
@QuarkusTest
class LibraryResourceIntegrationTest {

    @Test
    void whenGetBooksByTitle_thenBookShouldBeFound() {
        given().contentType(ContentType.JSON).param("query", "Dune")
                .when().get("/library/book")
                .then().statusCode(200)
                .body("size()", is(1))
                .body("title", hasItem("Dune"))
                .body("author", hasItem("Frank Herbert"));
    }

}
