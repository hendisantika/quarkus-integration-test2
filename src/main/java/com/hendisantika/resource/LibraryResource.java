package com.hendisantika.resource;

import com.hendisantika.model.Book;
import com.hendisantika.service.LibraryService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.22
 */
@Path("/library")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LibraryResource {

    @Inject
    LibraryService libraryService;

    @GET
    @Path("/book")
    public Set<Book> findBooks(@QueryParam("query") String query) {
        return libraryService.find(query);
    }
}
