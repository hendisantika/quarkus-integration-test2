package com.hendisantika;

import com.hendisantika.resource.LibraryResource;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;

import java.net.URL;

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

}
