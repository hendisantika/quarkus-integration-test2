package com.hendisantika;

import com.hendisantika.util.CustomTestProfile;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;

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

}
