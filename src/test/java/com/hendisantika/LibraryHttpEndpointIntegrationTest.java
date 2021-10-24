package com.hendisantika;

import com.hendisantika.resource.LibraryResource;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

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
@TestHTTPEndpoint(LibraryResource.class)
class LibraryHttpEndpointIntegrationTest {

    @Test
    void whenGetBooks_thenShouldReturnSuccessfully() {
        given().contentType(ContentType.JSON)
                .when().get("book")
                .then().statusCode(200);
    }
}
