package com.hendisantika.service;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-integration-test2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/10/21
 * Time: 21.19
 */
@ApplicationScoped
public class HelloService {

    @ConfigProperty(name = "greeting")
    String greeting;

    public String politeHello(String name) {
        return greeting + " " + name;
    }
}
