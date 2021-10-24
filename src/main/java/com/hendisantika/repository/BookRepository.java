package com.hendisantika.repository;

import com.hendisantika.model.Book;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.stream.Stream;

import static io.quarkus.panache.common.Parameters.with;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.07
 */
@ApplicationScoped
public class BookRepository implements PanacheRepository<Book> {

    public Stream<Book> findBy(String query) {
        return find("author like :query or title like :query", with("query", "%" + query + "%")).stream();
    }
}
