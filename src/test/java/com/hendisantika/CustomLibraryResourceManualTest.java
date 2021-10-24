package com.hendisantika;

import com.hendisantika.util.CustomTestProfile;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.33
 */
@QuarkusTest
@TestProfile(CustomTestProfile.class)
class CustomLibraryResourceManualTest {

    public static final String BOOKSTORE_ENDPOINT = "/custom/library/book";

    @Test
    void whenGetBooksGivenNoQuery_thenAllBooksShouldBeReturned() {
        given().contentType(ContentType.JSON)
                .when().get(BOOKSTORE_ENDPOINT)
                .then().statusCode(200)
                .body("size()", is(2))
                .body("title", hasItems("Foundation", "Dune"));
    }
}
