package com.hendisantika;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.NativeImageTest;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.39
 */
@NativeImageTest
@QuarkusTestResource(H2DatabaseTestResource.class)
class NativeLibraryResourceIT extends LibraryHttpEndpointIntegrationTest {
}
